package com.carrefour.automation.mobile.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.appium.java_client.AppiumDriver;

public class LoginMobileSteps {
    
    // Esse é um esboço para injetar o AppiumDriver. O projeto base já está preparado para receber a implementação completa.

    @Given("que abro o app demo do webdriverio")
    public void queAbroOAppDemoDoWebdriverio() {
        System.out.println("Appium driver inicializa app");
    }

    @When("navego ate a tab de login")
    public void navegoAteATabDeLogin() {
        System.out.println("Clicando na tab Login");
    }

    @And("preencho usuario {string} e senha {string} no mobile")
    public void preenchoUsuarioESenhaNoMobile(String usuario, String senha) {
        System.out.println("Preenchendo usuari e senha: " + usuario);
    }

    @Then("logo e valido a mensagem de sucesso")
    public void logoEValidoAMensagemDeSucesso() {
        System.out.println("Validando mensagem nativa");
    }
}
