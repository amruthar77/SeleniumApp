package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
    public static void main(String[] args)
    {
        System.out.println("Hello World!");
        ChromeOptions options = new ChromeOptions();

        // Headless mode for Jenkins/Linux
        options.addArguments("--headless=new");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        // Launch Chrome
        WebDriver driver = new ChromeDriver();

        // Open website
        driver.get("https://www.saucedemo.com/");

        // Maximize window
        driver.manage().window().maximize();

        // Login
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }
}
