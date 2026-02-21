package ParsingJsonResponseData;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class Using_assertions
{
    @Test
    void assertionsuse()
    {
       Response res=given()
                .contentType("application/json")

                .when()
                .get("https://jsonplaceholder.typicode.com/users");

                /*String comp=res.jsonPath().get("[4].company.name").toString();
                Assert.assertEquals(comp,"Keebler LLC");
                 Assert.assertEquals(res.statusCode(),200);
                  Assert.assertEquals(res.header("content-Type"),"application/json; charset=utf-8");
                  */
                       //But What if Response Size Changes?
                     List<String> comp=res.jsonPath().getList("company.name");
                     Assert.assertTrue(comp.contains("Keebler LLC"));


    }
}
