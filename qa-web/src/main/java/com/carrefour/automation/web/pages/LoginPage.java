package com.carrefour.automation.web.pages;

import com.carrefour.automation.core.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id = "user-name")
    private WebElement usernameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(id = "login-button")
    private WebElement loginBtn;

    public void acessarPagina(String url) {
        driver.get(url);
    }

    public void preencherCredenciais(String usuario, String senha) {
        sendKeys(usernameInput, usuario);
        sendKeys(passwordInput, senha);
    }

    public void submeterLogin() {
        click(loginBtn);
    }
}
