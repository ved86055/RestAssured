package Practise;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;

public class sample9
{
    @Test
    void getcookie()
    {
        Response res=given()
                .contentType("application-Type/json")




                .when()
                .get("https://www.google.com");

            String cookievalue= res.getCookie("NID");
        System.out.println(cookievalue);
    }

    @Test
    void getHeader()
    {
        Response res=given()


                .when()
                .get("https://www.google.com");

           String hdr=res.getHeader("Set-Cookie");
        System.out.println(hdr);


    }

}
