package com.hrizantemovich;

import com.codeborne.selenide.Configuration;
import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.hrizantemovich.TestData.*;

public class PracticeFormTestFaker {@BeforeAll
static void Beforeall(){
    Configuration.startMaximized = true;
}
    @Test
    void fillFormTest() {

        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue(firstName);
        $("#lastName").setValue(lastName);
        $("#userEmail").setValue(emailAddress);
        $("#genterWrapper");
        $(byText("Male")).click();
        $("#userNumber").setValue("1212121212");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("December");
        $(".react-datepicker__year-select").selectOption("1989");
        $(".react-datepicker__day--029:not(.react-datepicker__day--outside-month)").click();
        $("#subjectsInput").setValue("Math").pressEnter();
        $("#hobbiesWrapper");
        $(byText("Music")).click();
        $(byText("Reading")).click();
        $("#uploadPicture").uploadFromClasspath("img/2.png");
        $("#currentAddress").setValue(currentAdress);
        $("#state").click();
        $("#stateCity-wrapper").$(byText("NCR")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Noida")).click();

        $("#submit").click();
        $(".modal-header").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(text(firstName +" "+  lastName), text(emailAddress), text("Male"),
                text("1212121212"), text("29 December,1989"), text("Maths"), text("Music, Reading"), text("2.png"),
                 text(currentAdress), text("NCR Noida"));
    }
}
