package fileupload_download;

import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class uplad
{
    @Test
    void singlefileupload()
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
