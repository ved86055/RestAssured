package Practise;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class sample10
{
    @Test
   void postpojo()
    {
        sample11 s11=new sample11();
        s11.setBody("ved");
        s11.setUserId(200);
        s11.setTitle("mr");

        String coursesarr[]={"selenium","playwright"};
        s11.setCourses(coursesarr);

        given()
                .contentType("application/json")
                .body(s11)


                .when()
                .post("https://jsonplaceholder.typicode.com/posts")



                .then()
                .statusCode(201)
                .body("courses[0]",equalTo("selenium"))
                .body("courses[1]",equalTo("playwright"));
   }
}
