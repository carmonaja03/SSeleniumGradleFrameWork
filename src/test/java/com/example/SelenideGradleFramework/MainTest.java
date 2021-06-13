package com.example.SelenideGradleFramework;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class MainTest {
    private TodomvcPage page = new TodomvcPage();

    @BeforeAll
    static void beforeAll() {
    }
    @BeforeEach
    void setUp() {

    }
    @AfterEach
    void tearDown() {

    }

    @Test
    void todoMvc() {
        Selenide.open("https://todomvc.com/examples/angularjs/#/");
        page.addItem("Show Selenide");
        page.validateItem();
        page.clickShowItem();
    }
}
