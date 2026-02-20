package path_query_para;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class path_para
{
    @Test
    void testPathapara()
    {
        //https://jsonplaceholder.typicode.com/posts/1
        given()
                .pathParams("id",1)



                .when()
                .get("https://jsonplaceholder.typicode.com/posts/{id}")



                .then()
                .statusCode(200);









    }
}
