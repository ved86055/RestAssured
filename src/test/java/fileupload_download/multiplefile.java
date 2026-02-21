package fileupload_download;

import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.given;

public class multiplefile
{
    @Test
    void multipleupload()
    {
        File f1=new File("/home/vedprakash/Downloads/pctse.txt");
        File f2=new File("/home/vedprakash/Downloads/pctse2.txt");

        given()
                .multiPart("files",f1)
                .multiPart("files",f2)
                .contentType("multipart/formdata")

                .when()
                .post("https://httpbin.org/post")


                .then()
                .statusCode(200);
    }
}
