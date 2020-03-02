package main.java;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tuna {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        /*driver.get("http://google.com");

        Thread.sleep(3000);

        String title = driver.getTitle();

        String expectedTitle = "Google";

        System.out.println("title is =" + title);

        driver.close();

        if (expectedTitle.equals(title)) {

            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }*/

        driver.navigate().to(("http://amazon.com"));

        if (driver.getTitle().toLowerCase().contains("amazon")) {

            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
        driver.navigate().back();

        verifyEquals(driver.getTitle(), "amazon");

        driver.navigate().forward();

        System.out.println(driver.getTitle());

        driver.close();
    }

    public static void verifyEquals(String arg1, String arg2){

        if (arg1.equals(arg2)) {
            System.out.println("Test Passed");

        }else{

            System.out.println("Test Failed");
        }

        }
    }




