package com;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.when;
import static org.apache.commons.lang3.RandomStringUtils.randomAlphabetic;
import static org.hamcrest.Matchers.equalTo;

public class Hello {

  public static final String NAME = randomAlphabetic(10);

  public static void testHelloName(String name) {
    RestAssured.port = 8080;
    when()
            .get(name)
            .then().statusCode(200).log().all()
            .assertThat().body(equalTo(String.format("Hi there, %s!", name)));
  }

  public static void testHelloNameEmpty() {
    RestAssured.port = 8080;
    when()
            .get()
            .then().statusCode(200).log().all()
            .assertThat().body(equalTo("Hi there, !"));
  }
}
