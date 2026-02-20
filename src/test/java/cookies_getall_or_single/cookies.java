package cookies_getall_or_single;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class cookies
{
    //value keep on cjanging so it will fail : so our Tc will pass
  //  @Test
    void getcookies()
    {

        given()

                .when()
                .get("https://www.google.com")


                .then()
                .cookies("AEC","AaJma5uFYAbxWMbDZAM1A_fH2Ks-xK8mwi7T6iwxevYmqXy_c8D_0Ye6IQ");
    }


    @Test
    void getCookiesInfo()
    {
         Response res=given()

                .when()
                .get("https://www.google.com");

         //single cookie info need to get

        String  cookie_value =res.getCookie("AEC");
        System.out.println("Value of cookie is " + cookie_value);



    }







}
