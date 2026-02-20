package PostReqPayloadWays.POJO;

import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.oneOf;

public class POJO
{
    @Test
    void PostUsingPOJO()
    {

        POJO_Main data=new POJO_Main();

        data.setBody("Selenium testing");
        data.setUserID(12345);
        data.setTitle("Appium Testing");

        String coursesarr[]={"java","pythion"};

        data.setCourses(coursesarr);


        given()
                .headers("content-type","application/json","Cache-Control","no-cache")
                .body(data)

                .when()
                .post("https://jsonplaceholder.typicode.com/posts")


                .then()
                .statusCode(oneOf(200,201))
                .body("courses[0]",equalTo("java"))
                .body("courses[1]",equalTo("pythion"))
                .log().all();
    }
}

