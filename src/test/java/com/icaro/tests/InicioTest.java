package com.icaro.tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;


public class InicioTest {
    private WebDriver driver;

    @BeforeTest
    public void setup() {
        ChromeOptions options = new ChromeOptions();
        System.setProperty("webdriver.from.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
        options.addArguments("start-maximized");
        options.addArguments("incognito");

        options.setPageLoadTimeout(Duration.ofSeconds(60));

        this.driver = new ChromeDriver(options);


    }
    @Test
    public void ingresarAlInicio() {
        this.driver.get("http://www.automationpractice.pl/index.php");
    }

    @AfterTest
    public void tearDown() {
        this.driver.close();
    }
}
