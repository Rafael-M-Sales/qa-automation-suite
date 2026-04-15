package com.carrefour.automation.core.utils;

import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EvidenceManager {

    private static final String BASE_PATH = "evidencias/";

    public static void takeScreenshot(WebDriver driver, String scenarioName) {
        if (driver == null) return;

        try {
            File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            // Criar diretório diário /evidencias/YYYY-MM-DD/
            String dateFolder = LocalDate.now().format(DateTimeFormatter.ISO_LOCAL_DATE);
            Path directoryPath = Paths.get(BASE_PATH + dateFolder);
            
            if (!Files.exists(directoryPath)) {
                Files.createDirectories(directoryPath);
            }

            // Normalizar nome do cenário para arquivo
            String normalizedName = scenarioName.replaceAll("[^a-zA-Z0-9.-]", "_") + ".png";
            Path destinationPath = directoryPath.resolve(normalizedName);

            // Copiar arquivo
            Files.copy(srcFile.toPath(), destinationPath, java.nio.file.StandardCopyOption.REPLACE_EXISTING);

            // Anexar no Allure Report
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            Allure.addAttachment("Screenshot: " + scenarioName, new ByteArrayInputStream(screenshot));
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
