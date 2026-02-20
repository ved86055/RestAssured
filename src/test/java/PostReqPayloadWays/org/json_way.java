package PostReqPayloadWays.org;


//Post request body creation using org.json

import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class json_way
{
    @Test
    void PostmethodUsingOrgJsonLibrary()
    {

        JSONObject data=new JSONObject();
        data.put("title","NewTest");
        data.put("body","Restbody");
        data.put("userId",1002);

        String coursArr[]={"c","c++"};

        data.put("courses",coursArr);

        given()

                .headers("location","https://jsonplaceholder.typicode.com/posts/101","content-Type","application/json")
                .body(data.toString())



                .when()
                .post("https://jsonplaceholder.typicode.com/posts")


                .then()
                .statusCode(201)
                .body("courses[0]",equalTo("c"))
                .body("courses[1]",equalTo("c++"));
















    }
}
