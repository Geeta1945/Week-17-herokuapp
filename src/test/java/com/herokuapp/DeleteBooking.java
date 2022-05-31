package com.herokuapp;

import groovy.lang.DelegatesTo;
import io.restassured.response.Response;
import org.junit.Test;
import testbase.TestBase;

import static io.restassured.RestAssured.given;

public class DeleteBooking extends TestBase {

    @Test
    public void deleteBookingOfId(){

        Response response =given()
                .header("Cookie","b41e75e82a3d7ca")
                .pathParam("id",101)
                .when()
                .delete("/booking/{id}");
        response.then().statusCode(201);
        response.prettyPrint();
    }
}
