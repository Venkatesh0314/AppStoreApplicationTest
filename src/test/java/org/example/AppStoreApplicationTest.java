package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AppStoreApplicationTest {
    public static void main(String[] args){
        try {
            WebDriverManager.chromedriver().setup();
            // to set the path to the chorome driver
            WebDriver driver=new ChromeDriver();
            // to maximize the window
            driver.manage().window().maximize();
            // to open the url
            driver.get("https://qaappstore.ccbp.tech");

            // click on the social text
            WebElement clickButton=driver.findElement(By.xpath("//button[contains(text(),'Social')]"));
            clickButton.click();
            // print the statement
            List<WebElement>TofindTheApp=driver.findElements(By.xpath("//li[contains(@class,'app-item')]"));
            // write a condition
            if(TofindTheApp.size()==10){
                System.out.println("Social apps count is correct:");
            }else{
                System.out.println("Social apps count is incorrect");
            }
            // games section click
            WebElement GameSelect=driver.findElement(By.xpath("//button[contains(text(),'Games')]"));
            GameSelect.click();

            //to check gaming apps
            List<WebElement>GamingSelect=driver.findElements(By.xpath("//li[contains(@class,'app-item')]"));

            //if condition  check
            if (GamingSelect.size()==10){
                System.out.println("Gaming apps count is correct");
            }else{
                System.out.println("Gaming apps count is incorrect");
            }
            WebElement NewsButtonClick=driver.findElement(By.xpath("//button[contains(text(),'News')]"));
            NewsButtonClick.click();

            // check the elements on the screen
            List<WebElement>CheckItems=driver.findElements(By.xpath("//li[starts-with(@class,'app-item')]"));

            //to check the text
            if(CheckItems.size()==10){
                System.out.println("News apps count is correct");
            }else{
                System.out.println("News apps count is incorrect");
            }
            // click the food button
            WebElement FoodButton=driver.findElement(By.xpath("//button[contains(text(),'Food')]"));
            FoodButton.click();

            // click on the button element
            List<WebElement>allButtonFind=driver.findElements(By.xpath("//li[starts-with(@class,'app-item')]"));

            if(allButtonFind.size()==10){
                System.out.println("Food apps count is correct");
            }else{
                System.out.println("Food apps count is incorrect");
            }

            // click on the news tab
            WebElement newsWeb=driver.findElement(By.xpath("//button[contains(text(),'News')]"));
            newsWeb.click();

            // search input as news
            WebElement inputNews=driver.findElement(By.xpath("//input[contains(@class,'search-input')]"));
            inputNews.sendKeys("News");

            // to find the news elements

            List<WebElement>newsElement=driver.findElements(By.xpath("//li[starts-with(@class,'app-item')]"));

            // if statement
            if (newsElement.size()==7){
                System.out.println("News apps count is correct");
            }else{
                System.out.println("News apps count is incorrect");
            }

            List<WebElement> apps = driver.findElements(By.xpath("//li[starts-with(@class,'app-item')]"));
            for (WebElement app : apps) {
                System.out.println(app.getText());
            }


            driver.quit();



        }catch (Exception e){
            System.out.println("Hi venkatesh your code small exception error:"+e.getMessage());
        }
    }
}
