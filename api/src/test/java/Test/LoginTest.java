package Test;

import dto.LoginRoot;
import functions.Login;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import utils.Base;

import static common.APIConstants.IdentityPath;
import static common.Rest_Urls.Post_UserLogin;
import static io.restassured.RestAssured.given;


public class LoginTest extends Base {

    @Test(description = "verify successful login token details")
    public void verifyLoginTokenDetails() {

        LoginRoot loginRoot = Login.userLogin();

        softAssert.assertEquals(loginRoot.getToken_type(), "Bearer");
        softAssert.assertEquals(loginRoot.expires_in, 63072000);


    }

    @Test(description = "verify status Code for successful login")
    public void verifyLoginStatusCode() {

        Response response = given()
                .baseUri(IdentityPath)
                .contentType("application/x-www-form-urlencoded")
                .accept("application/json")
                .urlEncodingEnabled(false)
                .formParam("client_id", "sprint-crowd-app")
                .formParam("client_secret", "secret")
                .formParam("grant_type", "password")
                .formParam("username", "ZGluaXRoamF5YXNla2FyYTVAbGl2ZS5jb20=")
                .formParam("password", "Tm93eW91c2VlbWVAMTIz&")
                .formParam("scope", "scrowd-cp offline_access")
                .when()
                .post(Post_UserLogin);

        softAssert.assertEquals(response.statusCode(), 200);

    }

    @Test(description = "verify login with invalid password")
    public void verifyInvalidLoginStatusCode() {

        Response response = given()
                .baseUri(IdentityPath)
                .contentType("application/x-www-form-urlencoded")
                .accept("application/json")
                .urlEncodingEnabled(false)
                .formParam("client_id", "sprint-crowd-app")
                .formParam("client_secret", "secret")
                .formParam("grant_type", "password")
                .formParam("username", "ZGluaXRoamF5YXNla2FyYTVAbGl2ZS5jb20=")
                .formParam("password", "Tm93eW91c2VlbWVAM")
                .formParam("scope", "scrowd-cp offline_access")
                .when()
                .post(Post_UserLogin);

        softAssert.assertEquals(response.statusCode(), 500);

    }


}
