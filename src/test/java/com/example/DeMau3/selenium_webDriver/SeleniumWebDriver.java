package com.example.DeMau3.selenium_webDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWebDriver {
    private WebDriver webDriver;
    @BeforeEach
    void setUp(){
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
    }

    @Test
    void test() throws InterruptedException {
        //open
        webDriver.get("https://www.zoho.com/");

        webDriver.findElement(By.xpath("//a[@class='zgh-login'][normalize-space()='Sign In']")).click();
        Thread.sleep(3000);
        webDriver.findElement(By.xpath("//*[@id=\"signuplink\"]/a")).click();
        Thread.sleep(1000);

        webDriver.findElement(By.xpath("//input[@id='email']")).sendKeys("hiepndph52357@gmail.com");
        Thread.sleep(1000);

        webDriver.findElement(By.xpath("//input[@id='password']")).sendKeys("@Dinhhiep2304005");

    }
}
