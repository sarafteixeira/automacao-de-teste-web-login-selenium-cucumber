package saucedemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SwagLabsLogic {
    private WebDriver driver;
    private SwagLabsPage loginPage;

    private WebDriverWait wait;


    public SwagLabsLogic(WebDriver driver) {
        this.driver = driver;
        loginPage = PageFactory.initElements(driver, SwagLabsPage.class);
    }

    public void acessarSaucedemo() {
        driver.navigate().to("https://www.saucedemo.com/");
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(loginPage.getTxtSwagLabs()));
    }

    public void usernameValido() {
        loginPage.getUsername().sendKeys("standard_user");
    }

    public void passwordValida() {
        loginPage.getPassword().sendKeys("secret_sauce");
    }

    public void clicarLogin() {
        loginPage.getBntLogin().click();
    }

    public void autenticado() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(loginPage.getTxtSwagLabsAtutenticado()));
        driver.quit();
    }

    public void usernameInvalido() {
        loginPage.getUsername().sendKeys("standarduser");
    }

    public void passwordInvalida() {
        loginPage.getPassword().sendKeys("secretsauce");
    }

    public void erroAutenticacao() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(loginPage.getError()));
        driver.quit();
    }

    public void usernameBloqueado() {
        loginPage.getUsername().sendKeys("locked_out_user");
    }

    public void passwordBloqueado() {
        loginPage.getPassword().sendKeys("secret_sauce");
    }

    public void usuarioBloqueado() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(loginPage.getNotBloqueado()));
        driver.quit();
    }
}

