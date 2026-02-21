package Practise;

import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class sample13
{
    @Test
    void testap()
    {


        JSONObject data=new JSONObject();
        data.put("title","Serial");
        data.put("body","actor");
        data.put("userid",234);

        String[] coursesarr={"appium","manual"};

        data.put("courses",coursesarr);

        given()
                .body(data.toString())

                .when()
                .post("https://jsonplaceholder.typicode.com/posts")


                .then()
                .statusCode(201);








    }
}
