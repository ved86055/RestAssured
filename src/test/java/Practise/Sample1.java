package Practise;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import static io.restassured.RestAssured.given;

public class Sample1
{
    @Test
    void getUsersAll()
    {

        given()


                .when()
                .get("https://jsonplaceholder.typicode.com/users")


                .then()
                .statusCode(200)
                .body("[0].name", equalTo("Leanne Graham"))
                .log().all();
    }

    @Test
    void getsingleUser() {
        given()


                .when()
                .get("https://jsonplaceholder.typicode.com/users/1")


                .then()
                .statusCode(200)
                .body("address.zipcode", equalTo("92998-3874"))
                .body("company.name", equalTo("Romaguera-Crona"))
                .log().all();
    }

        @Test
                void getALlUserArrayPractise()
        {
            given()


                    .when()
                    .get("https://jsonplaceholder.typicode.com/users")


                    .then()
                    .statusCode(200)
                    .body("[1].username",equalTo("Antonette"))
                    .log().all();


        }


    }

