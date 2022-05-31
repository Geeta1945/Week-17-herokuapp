package com.herokuapp;

import io.restassured.response.Response;
import org.junit.Test;
import testbase.TestBase;

import static io.restassured.RestAssured.given;

public class GetBookingIds extends TestBase {
@Test
    public void getAllBookingIds(){

    Response response =given()
            .header("Content-Type", "application/json")
            .when()
            .get("/booking");
    response.then().statusCode(200);
    response.prettyPrint();
}

}
