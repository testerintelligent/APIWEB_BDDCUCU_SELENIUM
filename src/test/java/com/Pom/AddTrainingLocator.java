package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;

public class AddTrainingLocator {

    private WebDriver driver;

    public AddTrainingLocator() {

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[@type='button'][@aria-label='Add Training']")
    private WebElement addTrainingBtn;

    public WebElement getAddTrainingBtn() {
        return addTrainingBtn;
    }

}
