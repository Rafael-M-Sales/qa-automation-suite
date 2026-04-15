package com.carrefour.automation.web.pages;

import com.carrefour.automation.core.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryPage extends BasePage {

    @FindBy(className = "title")
    private WebElement titleLabel;

    public String getTituloDaPagina() {
        return getText(titleLabel);
    }
}
