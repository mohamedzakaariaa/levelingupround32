package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestThree {
    @Test
    public void test (){
        WebDriver driver = new ChromeDriver();
        driver.get("https://duckduckgo.com/");
        driver.manage().window().maximize();
        WebElement searchInput = driver .findElement(By.id("searchbox_input"));
        searchInput.sendKeys("https://www.selenium.dev/documentation/webdriver");
WebElement searchButton = driver.findElement(By.xpath("//button[@aria-label='Search']"));
        searchButton.click();
        driver.quit();
    }

}
//why it fails with WebElement searchButton = driver.findElement(By.className("iconButton_button__A_Uiu searchbox_searchButton__LxebD