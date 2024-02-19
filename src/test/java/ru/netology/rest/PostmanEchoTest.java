package ru.netology.rest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
public class PostmanEchoTest {
    @Test
    void shouldReturnSendData(){
        var text = "some data";
        given()
                .baseUri("https://postman-echo.com")
                .body("no data")

                .when()
                .post("/post")

                .then()
                .statusCode(200)
                .body("data", equalTo(text));
    }
}
