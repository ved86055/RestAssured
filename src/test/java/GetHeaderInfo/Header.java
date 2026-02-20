package GetHeaderInfo;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Header
{
   // @Test
    void testingheader()
    {

        given()


                .when()
                .get("https://www.google.com")


                .then()
                .header("content-Type","text/html; charset=ISO-8859-1")
                   .log().headers();
    }
    @Test
    void getHeader()
    {

        Response res=given()


                .when()
                .get("https://www.google.com");

        String headerValue=res.header("content-type");
        System.out.println(headerValue);






    }
}
