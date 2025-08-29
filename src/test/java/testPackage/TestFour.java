package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFour {
    @Test
    public void test (){
        WebDriver driver = new FirefoxDriver();
        driver.get("https://duckduckgo.com/");
        driver.manage().window().maximize();
        WebElement searchInput = driver .findElement(By.id("searchbox_input"));
        searchInput.sendKeys("TestNG");
        WebElement searchButton = driver.findElement(By.xpath("//button[@aria-label='Search']"));
        searchButton.click();
        WebElement fourthResult = driver.findElement(By.xpath("(//span[@class='EKtkFWMYpwzMKOYr0GYm LQVY1Jpkk8nyJ6HBWKAk'])[4]"));
        String fourthResultText = fourthResult.getText();

        Assert.assertNotEquals(fourthResultText,"TestNG Tutoria","the text is not equalTestNG Tutoria" );

        driver.quit();
    }
}
