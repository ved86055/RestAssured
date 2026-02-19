package PostReqPayloadWays;

import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.when;
import static org.hamcrest.Matchers.*;

//multiple ways to ceate request body
public class Hashmap {

    @Test
    void Hashnaptype()
    {
        HashMap data =new HashMap();
        data.put("title", "Updated Title");
        data.put("body", "Updated Body");
        data.put("userId", 305);

       String  coursesArr[]={"c","c++"};

        data.put("courses",coursesArr);

        given()
                .contentType("application/json")
                .body(data)

                .when()
                .post("https://jsonplaceholder.typicode.com/posts")


                .then()
                .statusCode(oneOf(200, 201))
                 .body("title",equalTo("Updated Title"))
                .body("body",equalTo("Updated Body"))
                .body("userId",equalTo(305))
                .body("courses[0]", equalTo("c"))
                .body("courses[1]", equalTo("c++"))
                .header("content-Type","application/json; charset=utf-8");


    }}











