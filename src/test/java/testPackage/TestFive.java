package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestFive {
    @Test
    public void test (){
        WebDriver driver = new ChromeDriver();
        driver.get("https://duckduckgo.com/");
        driver.manage().window().maximize();
        WebElement searchInput = driver .findElement(By.id("searchbox_input"));
        searchInput.sendKeys("Cucumber IO");
        WebElement searchButton = driver.findElement(By.xpath("//button[@aria-label='Search']"));
        searchButton.click();
WebElement secondResult = driver.findElement(By.xpath("(//span[@class='EKtkFWMYpwzMKOYr0GYm LQVY1Jpkk8nyJ6HBWKAk'])[2]"));
        String secondResultLink = secondResult.getAttribute("link");
        System.out.println(secondResultLink);
        driver.quit();



    }
}
