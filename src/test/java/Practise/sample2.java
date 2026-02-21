package Practise;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class sample2 {
    int id;

    @Test (priority = 1)
    void getAllUsers() {
        given()
                .contentType("application/json")

                .when()
                .get("https://jsonplaceholder.typicode.com/users")

                .then()
                .statusCode(200)
                .body("[0].address.city", equalTo("Gwenborough"))
                .log().all();
    }

    @Test(priority=2)
    void createUser() {
        HashMap data = new HashMap();
        data.put("title", "Software QA");
        data.put("body", "SOftware Dev");
        data.put("userId", "Scrum mAster");


        Response res = given()
                .contentType("application/json")
                .body(data)


                .when()
                .post("https://jsonplaceholder.typicode.com/posts");

               int idint= res.jsonPath().getInt("id");
        System.out.println("id captured is " + idint);
    }

    @Test(priority=3,dependsOnMethods = "createUser")
    void UpdateUser() {
        HashMap data = new HashMap();
        data.put("title", "Software backend");
        data.put("body", "SOftware UAT");
        data.put("userId", "product team");

        given()
                .contentType("application/json")
                .body(data)


                .when()
                .put("https://jsonplaceholder.typicode.com/posts/" + id)


                .then()
                .statusCode(200)
                .log().all();
    }
}



























