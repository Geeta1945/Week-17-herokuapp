package com.herokuapp;

import io.restassured.response.Response;
import org.junit.Test;
import testbase.TestBase;

import static io.restassured.RestAssured.given;

public class GetSingleBookingId extends TestBase {

    @Test
    public void getSingleBookingId(){

        Response response =given()
                .header("Content-Type", "application/json")
                .pathParam("id",49)
                .when()
                .get("/booking/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }

    }

