package ParsingJsonResponseData;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class App_using_javapath_finder
{
    @Test
    void testpath()
    {
        given()
                .contentType("application/json")



                .when()
                .get("https://jsonplaceholder.typicode.com/users")




                .then()
                .body("[4].company.name",equalTo("Keebler LLC"))
                .body("[5].email",equalTo("Karley_Dach@jasper.info"));
    }
}
