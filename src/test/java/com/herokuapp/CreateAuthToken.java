package com.herokuapp;

import io.restassured.response.Response;
import model.Token_Pojo;
import org.junit.Test;
import testbase.TestBase;

import java.util.ResourceBundle;

import static io.restassured.RestAssured.given;

public class CreateAuthToken extends TestBase {
//"token": "b41e75e82a3d7ca"
    @Test
    public void createAuthUser(){
        Token_Pojo token_pojo = new Token_Pojo();
        token_pojo.setUsername("admin");
        token_pojo.setPassword("password123");

        Response response = given()
                .header("Content-Type", "application/json")
                .body(token_pojo)
                .when()
                .post("/auth");
        response.then().statusCode(200);
        response.prettyPrint();
    }

}
