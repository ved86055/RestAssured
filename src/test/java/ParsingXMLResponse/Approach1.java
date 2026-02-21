package ParsingXMLResponse;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static java.lang.Math.log;
import static org.hamcrest.Matchers.equalTo;

public class Approach1
{
    @Test
    void Parsingxml()
    {
        given()
                .when()
                .get("https://www.w3schools.com/xml/simple.xml")

                .then()
                .statusCode(200)
                .header("content-Type","text/xml")
                .body("breakfast_menu.food[0].description",equalTo("Two of our famous Belgian Waffles with plenty of real maple syrup"))
                .log().all();

    }
}
