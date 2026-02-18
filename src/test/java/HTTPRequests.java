/*  these are 3 methhods in Restssured
    given() >>> preereq: pp,contentType,authentication,cookies,add para,add auth
     ,when(),>>>get,put,post
     then()  >>>validate status codeetc

    */



import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class HTTPRequests {
    @Test      // get request
    void getallusers() {
        given()

                .when()
                .get("https://jsonplaceholder.typicode.com/users")


                .then()
                .statusCode(200)
                .body("[0].id", equalTo(1))
                .log().all();
    }


      @Test     // get request
              void getSingleUser() {
          when()
                  .get("https://jsonplaceholder.typicode.com/users/1")

                  .then()
                  .statusCode(200)
                  .body("id", equalTo(1))
                  .log().all();


      }







}
