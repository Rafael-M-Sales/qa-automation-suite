package com.carrefour.automation.core.driver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverListener;

public class HighlightListener implements WebDriverListener {

    @Override
    public void beforeClick(WebElement element) {
        highlight(element);
    }

    @Override
    public void beforeSendKeys(WebElement element, CharSequence... keysToSend) {
        highlight(element);
    }

    private void highlight(WebElement element) {
        try {
            WebDriver driver = ((org.openqa.selenium.WrapsDriver) element).getWrappedDriver();
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].style.border='3px solid red'", element);
            // Aguardar um instante para o print capturar bem a ação caso tiremos print depois
            Thread.sleep(100); 
        } catch (Exception e) {
            // Ignorar exceptions caso o elemento não suporte highlight
        }
    }
}
