package schemavalidation;

import io.restassured.module.jsv.JsonSchemaValidator;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class jsonSchema
{
    @Test
    void jsonschemavalidation()
    {


        given()


                .when()
                .get("https://jsonplaceholder.typicode.com/users")


                .then()
                .assertThat().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("prepare.js"));
    }
}
