package Authentication;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Examples
{
    //1.Basic Auth
    @Test (priority = 1)
    void basicauth()
    {
        given()
                .auth().basic("postman","password")


                .when()
                .get("https://postman-echo.com/basic-auth")


                .then()
                .statusCode(200)
                .body("authenticated",equalTo(true));

    }
    //2.Digest
    @Test(priority = 2,dependsOnMethods ="basicauth")
    void digest() {
        given()
                .auth().digest("postman","password")

                .when()
                .get("https://postman-echo.com/basic-auth")


                .then()
                .statusCode(200);



    }
    //3.Preemptive

    @Test
    void preemptive() {
        given()
                .auth().preemptive().basic("postman", "password")

                .when()
                .get("https://postman-echo.com/basic-auth")


                .then()
                .statusCode(200)
                .log().all();
    }


}
