package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import java.time.Duration;


public class TestTwo  {




@Test
    public void test() {
    WebDriver driver = new ChromeDriver();
    // go to page
    driver.get("https://duckduckgo.com/");
    // maximize window
    driver.manage().window().maximize();
   WebElement logoImage = driver.findElement(By.xpath("/html/body/div/div/main/article/div[1]/div[1]/div[1]/header/div[1]/section[1]/a/img"));
   Assert.assertTrue(logoImage.isDisplayed(),"logo is not displayed");
    driver.quit();
}
}

//*[@id="__next"]/main/div[1]/div/div/header/div/section[1]/a/im
// (//img[@src=""])[1]
//img[@src=""][1]

