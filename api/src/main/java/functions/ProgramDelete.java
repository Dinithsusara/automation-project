package functions;

import dto.DeleteProgramRoot;
import dto.ProgramCreationData;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import utils.PropertyFileReader;

import static common.APIConstants.BasePath;
import static common.Rest_Urls.Post_RemoveProgram;
import static io.restassured.RestAssured.given;

public class ProgramDelete {


    private final static String Token = PropertyFileReader.getProperty("token");

    public static DeleteProgramRoot deleteProgram() {

        ProgramCreationData programCreationData = ProgramCreation.createProgram().Data;

        int ProgramID = programCreationData.getId();


        Response response = given()
                .contentType(ContentType.JSON)
                .baseUri(BasePath)
                .header("Authorization", "Bearer" + " " + Token)
                .pathParams("id", ProgramID)
                .when()
                .post(Post_RemoveProgram);

        JsonPath jsonPath = response.jsonPath();

        DeleteProgramRoot deleteProgramRoot = jsonPath.getObject("", DeleteProgramRoot.class);
        return deleteProgramRoot;


    }

    public static DeleteProgramRoot deleteInvalidProgramId() {

        int InvalidId=12;
        Response response = given()
                .contentType(ContentType.JSON)
                .baseUri(BasePath)
                .header("Authorization", "Bearer" + " " + Token)
                .pathParams("id", InvalidId)
                .when()
                .post(Post_RemoveProgram);

        JsonPath jsonPath = response.jsonPath();

        DeleteProgramRoot deleteProgramRoot = jsonPath.getObject("", DeleteProgramRoot.class);
        return deleteProgramRoot;


    }



}
