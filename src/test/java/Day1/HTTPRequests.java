package Day1;

import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class HTTPRequests
{

    int id;


    @Test (priority = 1)
    void getUSers() {
        given()

                .when()
                .get("https://jsonplaceholder.typicode.com/users")


                .then()
                .statusCode(200)
                .body("[0].id", equalTo(1))
                .log().all();
    }
      /*
      //this is post method :::: commenting this and now will captuire ID of request to use in put
      @Test
      void createuser()
    {
        HashMap data=new HashMap();
        data.put("selenium Testing","Learning ST");
        data.put("RestAssured Testing","practisin RAT");
        data.put("userid",302);

        given()
                .contentType("application/json")
                .body(data)

                .when()
                .post("https://jsonplaceholder.typicode.com/posts")

                .then()
                .statusCode(201)
                .log().all();
    }*/


    @Test (priority = 2)
    void createUser()    //create user and also capture id in this methoid
    {
        HashMap data = new HashMap();
        data.put("title", "Learning API");
        data.put("body", "RestAssured Practice");
        data.put("userId", 304);



        id = given()
                .contentType("application/json")
                .body(data)

                .when()
                .post("https://jsonplaceholder.typicode.com/posts")
                .jsonPath().getInt("id"); //after hitting post url we get Json get id & stiore if name getString
        System.out.println("id captured" + id);
    }

    @Test(priority = 3,dependsOnMethods ="createUser")
    void UpdateUser()          // from above method we are capturing id
    {
        HashMap data = new HashMap();
        data.put("title", "Updated Title");
        data.put("body", "Updated Body");
        data.put("userId", 305);




        given()
                .contentType("application/json")
                .body(data)


                .when()
                .put("https://jsonplaceholder.typicode.com/posts/"+id)


                .then()
                .statusCode(200)
                .log().all();




    }












}
