package ParsingXMLResponse;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static io.restassured.RestAssured.given;

public class Approch2
{
    @Test
    void xmlap2()
    {

       Response res=given()
                .when()
                .get("https://www.w3schools.com/xml/simple.xml");

       /*List<String> food=res.xmlPath().getList("breakfast_menu.food.name");
        Assert.assertTrue(food.contains("Belgian Waffles")); */

        Assert.assertEquals(res.statusCode(),200);
        String food=res.xmlPath().get("breakfast_menu.food[0].name").toString();
        Assert.assertEquals(food,"Belgian Waffles");

    }
}
