package com.carrefour.automation.web.steps;

import com.carrefour.automation.web.pages.InventoryPage;
import com.carrefour.automation.web.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class LoginWebSteps {

    private final LoginPage loginPage = new LoginPage();
    private final InventoryPage inventoryPage = new InventoryPage();

    @Given("que eu acesso a pagina de login web {string}")
    public void queEuAcessoAPaginaDeLoginWeb(String url) {
        loginPage.acessarPagina(url);
    }

    @When("eu preencho o usuario {string} e a senha {string}")
    public void euPreenchoOUsuarioEASenha(String usuario, String senha) {
        loginPage.preencherCredenciais(usuario, senha);
    }

    @And("clico no botao de login")
    public void clicoNoBotaoDeLogin() {
        loginPage.submeterLogin();
    }

    @Then("devo ser redirecionado para a pagina de inventario com o titulo {string}")
    public void devoSerRedirecionadoParaAPaginaDeInventarioComOTitulo(String tituloEsperado) {
        Assertions.assertEquals(tituloEsperado, inventoryPage.getTituloDaPagina());
    }
}
