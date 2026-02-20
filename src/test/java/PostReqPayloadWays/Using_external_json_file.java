package PostReqPayloadWays;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import static io.restassured.RestAssured.given;
import static java.util.concurrent.CompletableFuture.anyOf;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.oneOf;

public class Using_external_json_file
{
    @Test
    void PostUsingextFile() throws FileNotFoundException {

        File f=new File("src/test/createPost.json");

        FileReader fr=new FileReader(f);


        JSONTokener jt=new JSONTokener(fr);


        JSONObject data=new JSONObject(jt);

        given()
                .headers("content-Type","application/json","location","https://jsonplaceholder.typicode.com/posts/101","Cache-Control","no-cache")
                .body(data.toString())


                .when()
                .post("https://jsonplaceholder.typicode.com/posts")


                .then()
                .statusCode(oneOf(200,201))
                .body("courses[0]",equalTo("c"))
                .body("courses[1]",equalTo("c++"))
                .log().all();










    }
}
