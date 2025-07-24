package functions;

import dto.ProgramCreationData;
import dto.UpdateProgramRoot;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.json.JSONArray;
import org.json.JSONObject;
import utils.PropertyFileReader;

import static common.APIConstants.BasePath;
import static common.Rest_Urls.Put_UpdateProgram;
import static io.restassured.RestAssured.given;

public class ProgramUpdate {

    private final static String Token = PropertyFileReader.getProperty("token");

    public static UpdateProgramRoot updateProgram() {

        ProgramCreationData programCreationData = ProgramCreation.createProgram().Data;
        int ProgramId = programCreationData.getId();

        JSONObject jsonObject = new JSONObject();

        jsonObject.put("Id", ProgramId);
        jsonObject.put("Name", "APIAutomation");
        jsonObject.put("Description", "description");
        jsonObject.put("StartDate", "2025-09-12T14:48:00.000Z");
        jsonObject.put("Duration", 1);
        jsonObject.put("IsPrivate", false);
        jsonObject.put("ImageUrl", "imageUrl");
        jsonObject.put("ProgramCode", "PROMO");
        jsonObject.put("IsPublish", false);
        jsonObject.put("PromotionalText", "promotionText");
        jsonObject.put("IsPromoteInApp", false);
        jsonObject.put("CompanyId", 0);
        jsonObject.put("Departments", new JSONArray[0]);


        Response response = given()
                .contentType(ContentType.JSON)
                .baseUri(BasePath)
                .header("Authorization", "Bearer" + " " + Token)
                .body(jsonObject.toString())
                .when()
                .put(Put_UpdateProgram);

        JsonPath jsonPath = response.jsonPath();

        UpdateProgramRoot updateProgramRoot = jsonPath.getObject("", UpdateProgramRoot.class);
        return updateProgramRoot;


    }

}
