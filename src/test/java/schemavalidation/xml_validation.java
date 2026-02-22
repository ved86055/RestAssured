package schemavalidation;

import io.restassured.matcher.RestAssuredMatchers;
import io.restassured.module.jsv.JsonSchemaValidator;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class xml_validation
{
    @Test
    void xmlfilevalidation()
    {
        given()




                .when()
                .get("https://www.w3schools.com/xml/simple.xml")



                .then()
                .assertThat().body(RestAssuredMatchers.matchesXsdInClasspath("xmlvalid"));







    }
}
