package com.carrefour.automation.web.pages;

import com.carrefour.automation.core.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryPage extends BasePage {

    @FindBy(className = "title")
    private WebElement titleLabel;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement btnAddBackpack;

    @FindBy(className = "shopping_cart_badge")
    private WebElement lblCartBadge;

    @FindBy(className = "shopping_cart_link")
    private WebElement btnCart;

    public String getTituloDaPagina() {
        return getText(titleLabel);
    }

    public void adicionarMochilaAoCarrinho() {
        click(btnAddBackpack);
    }

    public String getQuantidadeCarrinho() {
        return getText(lblCartBadge);
    }

    public void acessarCarrinho() {
        click(btnCart);
    }
}
