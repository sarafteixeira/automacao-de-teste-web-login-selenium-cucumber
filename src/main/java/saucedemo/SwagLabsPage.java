package saucedemo;

import io.cucumber.messages.internal.com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class SwagLabsPage {

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[1]")
    private WebElement txtSwagLabs;

    @FindBy(id = "user-name")
    private WebElement username;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "login-button")
    private WebElement bntLogin;

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[1]/div[2]/div")
    private WebElement txtSwagLabsAtutenticado;

    @FindBy(xpath = "//*[@id=\"login_button_container\"]/div/form/div[3]/h3")
    private WebElement error;

    @FindBy(xpath = "//*[@id=\"login_button_container\"]/div/form/div[3]/h3")
    private WebElement notBloqueado;

}

