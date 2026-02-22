package Authentication;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class BearerToken
{
    @Test
    void bearerToken()
    {
        given()
                .headers("Authorisation","eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VyX2lkIjozNjMzLCJleHAiOjE3NzE4NTQ4MTYsImlhdCI6MTc3MTc2ODQxNn0.Dbh-dHqUIfn1CFg7L6nvA4dbBKrcf4iDuj_clRgArKc")



                .when()
                .get("https://qa-delivery.countrydelight.in")



                .then()
                .statusCode(200);

    }
}
