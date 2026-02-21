package Practise;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class sample14
{
    @Test
    void pcstse()
    {



        Response res=given()
                .contentType("application/json")



                .when()
                .get("https://jsonplaceholder.typicode.com/users");



        /*List<String> add=res.jsonPath().getList("address.street");
        Assert.assertTrue(add.contains("Hoeger Mall"));*/

         List<String> add=res.jsonPath().getList("address.street");
         Assert.assertTrue(add.contains("Hoeger Mall"));










    }
}
