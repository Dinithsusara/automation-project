package functions;

import dto.LoginRoot;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;


import static common.APIConstants.IdentityPath;
import static common.Rest_Urls.Post_UserLogin;
import static io.restassured.RestAssured.given;

public class Login {


    ;

    public static LoginRoot userLogin() {


        Response response = given()
                .baseUri(IdentityPath)
                .contentType("application/x-www-form-urlencoded")
                .accept("application/json")
                .urlEncodingEnabled(false)
                .formParam("client_id", "sprint-crowd-app")
                .formParam("client_secret", "secret")
                .formParam("grant_type", "password")
                .formParam("username", "ZGluaXRoamF5YXNla2FyYTVAbGl2ZS5jb20=")
                .formParam("password", "VGVzdGRpbml0aEAxMjM=")
                .formParam("scope", "scrowd-cp offline_access")
                .when()
                .post(Post_UserLogin);


        JsonPath jsonPath = response.jsonPath();

        LoginRoot loginRoot = jsonPath.getObject("", LoginRoot.class);

        return loginRoot;

    }
}
