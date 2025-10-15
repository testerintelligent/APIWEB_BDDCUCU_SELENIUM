
package com.Pom;

import org.openqa.selenium.By;

public class loginOR {
    public static final By EMAIL_INPUT = By.xpath("//input[@name=\"email\"]");
    public static final By PASSWORD_INPUT = By.xpath("//input[@name=\"password\"]");
    public static final By LOGIN_BUTTON = By.xpath("(//*[contains(text(),'Log in')])[4]");
}
