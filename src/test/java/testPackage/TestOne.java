package testPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestOne {
    @Test
    public void test (){
        WebDriver driver =new ChromeDriver();
        driver.navigate().to("https://duckduckgo.com/");
        String title = driver.getTitle();
       // Assert.assertEquals(title,"Google");
        Assert.assertNotEquals(title,"Google","the title is not equal google" );
        driver.quit();
    }
}
