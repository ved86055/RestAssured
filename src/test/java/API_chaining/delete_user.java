package API_chaining;

import org.testng.ITestContext;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class delete_user
{
    @Test
    void deleteUser(ITestContext context)
    {
        String bearerToken="Bearer e7912c68171c60e4fbe1d5bcb209c777bbd37dcdac6bc76b0875a8554a1e799e";
       // int id= (Integer) context.getAttribute("user_id");

        int id= (Integer) context.getSuite().getAttribute("user_id");

        given()
                .header("Authorization",bearerToken)
                .contentType("application/json")
                .pathParam("id",id)

                .when()
                .delete("https://gorest.co.in/public/v2/users/{id}")

                .then()
                .statusCode(204)
                .log().all();


    }
}
