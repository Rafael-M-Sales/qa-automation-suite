package com.carrefour.automation.api.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class LoginStepDefs {

    private RequestSpecification request;
    private Response response;

    @Given("que eu configuro a rota de login")
    public void queEuConfiguroARotaDeLogin() {
        RestAssured.baseURI = "https://serverest.dev";
        request = given()
                .filter(new AllureRestAssured()) // Logar no Allure
                .header("Content-Type", "application/json");
    }

    @When("eu envio a requisicao de login com email {string} e senha {string}")
    public void euEnvioARequisicaoDeLoginComEmailESenha(String email, String senha) {
        String body = String.format("{\"email\": \"%s\", \"password\": \"%s\"}", email, senha);
        response = request.body(body).post("/login");
    }

    @Then("o status code deve ser {int}")
    public void oStatusCodeDeveSer(int statusCode) {
        response.then().statusCode(statusCode);
    }

    @And("a resposta deve conter a mensagem {string}")
    public void aRespostaDeveConterAMensagem(String mensagem) {
        response.then().body("message", equalTo(mensagem));
    }
}
