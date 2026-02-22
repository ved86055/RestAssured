package API_chaining;

import com.github.javafaker.Faker;
import org.json.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class update_user
{
    @Test
   void updateUser(ITestContext context)
   {
       Faker f=new Faker();
       JSONObject data=new JSONObject();
       data.put("name",f.name().fullName());
       data.put("gender","female");
       data.put("email",f.internet().emailAddress());
       data.put("status","inactive");

       String bearerToken="Bearer e7912c68171c60e4fbe1d5bcb209c777bbd37dcdac6bc76b0875a8554a1e799e";
       int id= (Integer) context.getAttribute("user_id");
       given()
               .pathParam("id",id)                     //captured id
               .header("Authorization",bearerToken)
               .contentType("application/json")
               .body(data.toString())


               .when()
               .put("https://gorest.co.in/public/v2/users/{id}")


               .then()
               .statusCode(200)
               .log().all();


   }
}
