package ru.netology.rest;

import org.junit.jupiter.api.Test;


public class PostmanEchoTest {
    @Test
    void shouldReturnSendData
        var text = "Hi";
        given()
                .baseUri("https://postman-echo.com")
                .body(text)
// Выполняемые действия
                .when()
                .post("/post")
// Проверки
                .then()
                .statusCode(200)
                .body(data, equalTo(text));
}
