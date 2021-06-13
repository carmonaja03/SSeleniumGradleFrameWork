package com.example.SelenideGradleFramework;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

// https://todomvc.com/examples/angularjs/#/
public class TodomvcPage {

    public SelenideElement newtodoInput = $(By.xpath("//input[@ng-model='newTodo']"));
    public SelenideElement showItem = $(byText("Show Selenide"));

    void addItem(String item){
        newtodoInput.sendKeys(item);
        newtodoInput.pressEnter();
    }
    void validateItem(){
        showItem.shouldBe(Condition.visible);
    }

    public void clickShowItem() {
        showItem.click();
    }
}