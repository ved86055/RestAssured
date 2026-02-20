package Practise;

import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.oneOf;

public class sample5
{
    @Test
    void retestput()
    {


                HashMap data =new HashMap();
                data.put("title", "Updated Title");
                data.put("body", "Updated Body");
                data.put("userId", 305);

                String coursesr[]={"c","c++"};

                data.put("courses",coursesr);

                given()
                        .contentType("application/json")
                        .body(data)

                        .when()
                        .post("https://jsonplaceholder.typicode.com/posts")

                        .then()
                        .statusCode(oneOf(200,201))
                        .body("courses[0]",equalTo("c"))
                        .body("courses[1]",equalTo("c++"));








            }

}
