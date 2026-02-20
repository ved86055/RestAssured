package path_query_para;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class query_para
{
    @Test
    void testinguerypara()
    {

        //  https://jsonplaceholder.typicode.com/posts?userId=1&id=1

        given()
                .queryParam("userId",1)
                .queryParam("id",1)


                .when()
                .get("https://jsonplaceholder.typicode.com/posts?userId=1&id=1")


                .then()
                .statusCode(200)
                .log().all();


    }
}
