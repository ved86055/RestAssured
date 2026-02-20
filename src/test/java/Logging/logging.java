package Logging;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class logging
{
    @Test
    void Loggingdetailsall()
    {

        given()


                .when()
                .get("https://www.google.com")

                .then()
                .statusCode(200)
               // .log().headers();    //only headers all of it
                //.log().all();
                .log().cookies();
    }
}
