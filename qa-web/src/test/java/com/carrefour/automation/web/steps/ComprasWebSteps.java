package com.carrefour.automation.web.steps;

import com.carrefour.automation.web.pages.CartPage;
import com.carrefour.automation.web.pages.InventoryPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class ComprasWebSteps {

    private final InventoryPage inventoryPage = new InventoryPage();
    private final CartPage cartPage = new CartPage();

    @When("eu clico no botao de adicionar ao carrinho do produto Sauce Labs Backpack")
    public void euClicoNoBotaoDeAdicionarAoCarrinhoDoProdutoSauceLabsBackpack() {
        inventoryPage.adicionarMochilaAoCarrinho();
    }

    @Then("devo ver o icone do carrinho com a quantidade {string}")
    public void devoVerOIconeDoCarrinhoComAQuantidade(String qtdEsperada) {
        Assertions.assertEquals(qtdEsperada, inventoryPage.getQuantidadeCarrinho());
    }

    @And("eu clico no icone do carrinho")
    public void euClicoNoIconeDoCarrinho() {
        inventoryPage.acessarCarrinho();
    }

    @Then("devo ser redirecionado para a pagina do carrinho")
    public void devoSerRedirecionadoParaAPaginaDoCarrinho() {
        // Assertions adicionais se necessário, a URL poderia ser verificada
    }

    @And("o produto Sauce Labs Backpack deve estar listado")
    public void oProdutoSauceLabsBackpackDeveEstarListado() {
        Assertions.assertEquals("Sauce Labs Backpack", cartPage.getNomeProduto());
    }
}
