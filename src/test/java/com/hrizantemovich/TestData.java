package com.hrizantemovich;

import com.github.javafaker.Faker;

public class TestData {
    static Faker faker = new Faker();

    public static String
            firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            emailAddress = faker.internet().emailAddress(),
            currentAdress = faker.address().fullAddress();

    }