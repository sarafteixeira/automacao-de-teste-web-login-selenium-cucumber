package saucedemo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SwagLabsSteps {

    private WebDriver driver;
    private SwagLabsLogic loginLogic;

    public SwagLabsSteps() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        loginLogic = new SwagLabsLogic(driver);
    }

    @Given("que eu estou na tela inicial")
    public void que_eu_estou_na_tela_inicial() {
        loginLogic.acessarSaucedemo();
    }

    @When("insiro credenciais validas {string} e {string}")
    public void insiro_credenciais_validas_e(String string, String string2) {
        loginLogic.usernameValido();
        loginLogic.passwordValida();
    }

    @When("clico em login")
    public void clico_em_login() {
        loginLogic.clicarLogin();
    }

    @Then("sou autenticado com sucesso")
    public void sou_autenticado_com_sucesso() {
        loginLogic.autenticado();
    }

    @When("insiro credenciais inválidas {string} e {string}")
    public void insiro_credenciais_invalidas_e(String string, String string2) {
        loginLogic.usernameInvalido();
        loginLogic.passwordInvalida();
    }

    @Then("não sou autenticado")
    public void nao_sou_autenticado() {
        loginLogic.erroAutenticacao();
    }


    @When("insiro as credenciais {string} e {string}")
    public void insiro_as_credenciais_e(String string, String string2) {
        loginLogic.usernameBloqueado();
        loginLogic.passwordBloqueado();
    }

    @Then("recebo uma notificação de usuário bloqueado")
    public void recebo_uma_notificaçao_de_usuario_bloqueado() {
        loginLogic.usuarioBloqueado();
    }




}

