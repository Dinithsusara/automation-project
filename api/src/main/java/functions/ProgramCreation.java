package functions;

import dto.ProgramCreationRoot;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import utils.PropertyFileReader;

import static common.APIConstants.BasePath;
import static common.Rest_Urls.Post_CreateProgram;
import static io.restassured.RestAssured.given;

public class ProgramCreation {


    private final static String Token = PropertyFileReader.getProperty("token");

    public static ProgramCreationRoot createProgram() {


        JSONObject jsonObject = new JSONObject();

        jsonObject.put("Name", "TestProgramForWebAPI");
        jsonObject.put("Description", "Test");
        jsonObject.put("IsPrivate", false);
        jsonObject.put("Duration", 1);
        jsonObject.put("ProgramCode", "PROMO");
        jsonObject.put("ImageUrl", "imageUrl");
        jsonObject.put("StartDate", "2025-08-12T14:48:00.000Z");
        jsonObject.put("PromotionalText", "promotionText");
        jsonObject.put("IsPromoteInApp", false);
        jsonObject.put("CompanyId", 1);
        jsonObject.put("Departments", new JSONArray[0]);

        Response response = given()
                .contentType(ContentType.JSON)
                .baseUri(BasePath)
                .header("Authorization", "Bearer" + " " + Token)
                .body(jsonObject.toString())
                .when()
                .post(Post_CreateProgram);

        JsonPath jsonPath = response.jsonPath();

        ProgramCreationRoot programCreatrionRoot = jsonPath.getObject("", ProgramCreationRoot.class);
        return programCreatrionRoot;
    }
}