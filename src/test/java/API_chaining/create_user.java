package API_chaining;

import com.github.javafaker.Faker;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

//using org.json to send data in post request
public class create_user
{
    @Test
    void createUser(ITestContext context)
    {
        Faker f=new Faker();

        JSONObject data=new JSONObject();
        data.put("name",f.name().lastName());
        data.put("gender","male");
        data.put("email",f.internet().emailAddress());
        data.put("status","active");

        String bearerToken="Bearer e7912c68171c60e4fbe1d5bcb209c777bbd37dcdac6bc76b0875a8554a1e799e";

        int id=given()
                .headers("Authorization",bearerToken)
                .contentType("application/json")
                .body(data.toString())

                .when()
                .post("https://gorest.co.in/public/v2/users")
                 .jsonPath().getInt("id");
        System.out.println("captured id is " + id );

       // context.setAttribute("user_id",id); This is at test level onkly & not suite level

        context.getSuite().setAttribute("user_id",id);

    }
}
