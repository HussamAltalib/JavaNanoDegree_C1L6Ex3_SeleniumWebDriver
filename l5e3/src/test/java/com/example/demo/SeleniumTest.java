package com.example.demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().browserVersion("122.0.6261.70").setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080/animal");
        WebElement inputField = driver.findElement(By.id ("animalText"));
        inputField.sendKeys("CatSel");
        WebElement adjectiveField = driver.findElement(By.id ("adjective"));
        adjectiveField.sendKeys("MewoooXX");
        adjectiveField.submit();
        Thread.sleep(5000);
        driver.quit();
    }
}
