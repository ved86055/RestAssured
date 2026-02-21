package Practise;

import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.given;

public class sample15
{
    @Test
    void upload()
    {
        File f=new File("/home/vedprakash/Downloads/pctse.txt");

        given()
                .multiPart("file",f)
                .contentType("multipart/formdata")

                .when()
                .post("https://httpbin.org/post")


                .then()
                .statusCode(200)
                .log().all();


    }
}
