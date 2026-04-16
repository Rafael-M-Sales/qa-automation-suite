package com.carrefour.automation.web.pages;

import com.carrefour.automation.core.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {

    @FindBy(className = "inventory_item_name")
    private WebElement itemName;

    public String getNomeProduto() {
        return getText(itemName);
    }
}
