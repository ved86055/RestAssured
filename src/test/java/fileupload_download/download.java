package fileupload_download;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class download
{
    @Test
    void downloadfile()
    {

        given()



                .when()
                .get("https://www.w3.org/WAI/ER/tests/xhtml/testfiles/resources/pdf/dummy.pdf")


                .then()
                .statusCode(200);







    }
}
