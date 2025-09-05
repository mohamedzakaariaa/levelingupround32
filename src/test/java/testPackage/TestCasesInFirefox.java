package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCasesInFirefox {
private WebDriver driver;

/**
 * Open Mozilla Firefox
 *go to <a href="https://duckduckgo.com/">...</a>
 * Search for [TestNG]
 * Assert that the text of the fourth result is [TestNG Tutorial]
 * Close Mozilla Firefox
 */
    @Test
    public void testFour (){
      driver.get("https://duckduckgo.com/?t=h_&q=+TestNG&ia=web");

        Wait<WebDriver> wait= new FluentWait<>(driver) .withTimeout(java.time.Duration.ofSeconds(10))
                .pollingEvery(java.time.Duration.ofSeconds(2))
                .ignoring(InvalidSelectorException.class);
        wait.until(driver -> {
            By fourthResultLocator = By.xpath("");

            String fourthResultText = driver.findElement(fourthResultLocator).getText();
            String expected = "TestNG Tutorial";
            Assert.assertEquals(fourthResultText, expected, "the text is not equal TestNG Tutorial");
            return true;
        });



    }










    @BeforeMethod
    public void setup(){
        driver=new FirefoxDriver();
    };
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
