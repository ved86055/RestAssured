package Practise;


import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.Map;

import static io.restassured.RestAssured.given;


public class sample7
{
    @Test
    void getcookies()
    {

        Response value =given()

                .when()
                .get("https://www.google.com");

       String  cookiesvalue=value.getCookie("AEC");
       String cookie=value.getCookie("NID");
        System.out.println("cookie value is"+cookiesvalue );
        System.out.println("c value is"+cookie );
    }

    @Test
    void getheader()
    {
        Response res=given()

                .when()
                .get("https://www.google.com");

        String headerval1=res.getHeader("Cache-Control");
        String headerval2=res.getHeader("Server");
        System.out.println("Header vakue is " +  headerval1);
        System.out.println("Header vakue is " +  headerval2);


    }



}
