package org.example.managers;

import org.example.enums.ParserSettings;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BonchManager {
    protected static boolean loginBonch(final String USERNAME, final String PASSWORD) throws InterruptedException {
        boolean isAuth;
        final long duration = 2000;
        System.setProperty("webdriver.chrome.driver.exe", "/usr/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(ParserSettings.URL.getField());
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(duration);
        WebElement loginField = driver.findElement(By.id(ParserSettings.LOGIN_ID.getField()));
        WebElement passwordField = driver.findElement(By.id(ParserSettings.PASSWORD_ID.getField()));
        WebElement authButton = driver.findElement(By.id(ParserSettings.AUTH_ID.getField()));
        loginField.sendKeys(USERNAME);
        passwordField.sendKeys(PASSWORD);
        authButton.click();
        Thread.sleep(duration);
        WebElement titleElement = driver.findElement(By.className(ParserSettings.TITLE_CLASS_NAME.getField()));
        titleElement.click();
        Thread.sleep(duration);
        WebElement scheduleElement = driver.findElement(By.className(ParserSettings.SCHEDULE_CLASS_NAME.getField()));
        scheduleElement.click();
        Thread.sleep(duration);
        WebElement scrollTO = driver.findElement(By.className(ParserSettings.SCROLL_CLASS_NAME.getField()));
        js.executeScript(ParserSettings.SCRIPT.getField(), scrollTO);
        Thread.sleep(duration);
        try{
            driver.findElement(new By.ByLinkText(ParserSettings.START_LESSON_TITLE.getField())).click();
            isAuth = true;
            Thread.sleep(duration);
        }
        catch (org.openqa.selenium.NoSuchElementException e){
            isAuth = false;
            Thread.sleep(duration);
        }
        finally {
            driver.quit();
        }
        return isAuth;
    }
}
