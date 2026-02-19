package Practise;

import org.testng.annotations.Test;

import java.util.HashMap;


import static io.restassured.RestAssured.given;
import static java.util.concurrent.CompletableFuture.anyOf;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.oneOf;


public class sample3
{
    @Test
    void Hasmaptype()
    {
        HashMap data =new HashMap();
        data.put("title", "Updated Title");
        data.put("body", "Updated Body");
        data.put("userId", 305);

        String coursearr[]={"c","c++"};
        data.put("courses",coursearr);


        given()
                .contentType("application/json")
                .body(data)


                .when()
                .put("https://jsonplaceholder.typicode.com/posts/1")


                .then()
                .statusCode(201)
                .body("title",equalTo("Updated Title"))
                .body("courses[0]",equalTo("c"))
                .body("courses[1]",equalTo("c++"))
                .header("content-type",equalTo("application/json; charset=utf-8"));










    }
}

