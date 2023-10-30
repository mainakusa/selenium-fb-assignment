package com.assignment.selenium_fb_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        System.setProperty("webdriver.chrome.driver", "chromedriver-mac-x64/chromedriver");
        
        ChromeOptions chromeOptions = new ChromeOptions();
        
        WebDriver driver = new ChromeDriver(chromeOptions);
        
        driver.get("https://www.facebook.com");
        
        driver.findElement(By.id("email")).sendKeys("mb2023@yahoo.co.in");
        driver.findElement(By.id("pass")).sendKeys("mb2023");
        Thread.sleep(2000);
        
        driver.findElement(By.name("login")).click();
        Thread.sleep(30000);
        
        driver.close();
    }
}
