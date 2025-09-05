package testPackage;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;
import java.io.File;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.NoSuchElementException;

public class TestCasesInGoogle {
    private WebDriver driver;
    /**
     * open chrome browser
     * go to <a href="https://duckduckgo.com/">...</a>
     * Assert that the page title is [Google]
     * Close Google Chrome
     */
@Test
public void testOneTitle (){
    driver.get("https://duckduckgo.com/");
    String actualTitle = driver.getTitle();
    String  expectedTitle = "Google";
     Assert.assertEquals(actualTitle,expectedTitle,"the title is not equal google" );
    // Assert.assertNotEquals(title,"Google","the title is not equal google" );
}

    /**
     * open chrome browser
     * go to <a href="https://duckduckgo.com/">...</a>
     * Assert that the duckduckgo logo is displayed
     * Close Google Chrome
     */
    @Test
    public void testTwoLogo (){
        ChromeOptions chromeOptions = new ChromeOptions();
        Duration duration = Duration.of(50, ChronoUnit.SECONDS);
        chromeOptions.setImplicitWaitTimeout(duration);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.get("https://duckduckgo.com/");


       // Why is this not working mr mohab ??
//  By logoLocator = By.xpath("//a//img[@src='data:image/svg+xml;base64,PHN2ZyBmaWxsPSJub25lIiB2aWV3Qm94PSIwIDAgMTU0IDMyIiB4bWxucz0iaHR0cDovL3d3dy53My5vcmcvMjAwMC9zdmciPgogIDxwYXRoIGZpbGw9IiNkZTU4MzMiIGZpbGwtcnVsZT0iZXZlbm9kZCIgZD0iTTE1IDMwYzguMjg0IDAgMTUtNi43MTYgMTUtMTUgMC04LjI4NC02LjcxNi0xNS0xNS0xNUM2LjcxNiAwIDAgNi43MTYgMCAxNWMwIDguMjg0IDYuNzE2IDE1IDE1IDE1eiIgY2xpcC1ydWxlPSJldmVub2RkIi8+CiAgPHBhdGggZmlsbD0iI2RkZCIgZmlsbC1ydWxlPSJldmVub2RkIiBkPSJNMTcuMTEgMjYuMTkxYzAtLjExNy4wMjgtLjE0My0uMzQ0LS44ODYtLjk5LTEuOTgyLTEuOTg1LTQuNzc3LTEuNTMzLTYuNTguMDgzLS4zMjgtLjkzMi0xMi4xMjctMS42NS0xMi41MDctLjc5Ny0uNDI1LTEuNzc5LTEuMS0yLjY3Ni0xLjI1LS40NTYtLjA3My0xLjA1My0uMDM4LTEuNTIuMDI1LS4wODIuMDExLS4wODYuMTYtLjAwNi4xODcuMzA2LjEwNC42NzguMjg0Ljg5Ny41NTcuMDQyLjA1MS0uMDE0LjEzMi0uMDguMTM1LS4yMDcuMDA3LS41ODIuMDk0LTEuMDc2LjUxNC0uMDU4LjA0OS0uMDEuMTQuMDY0LjEyNSAxLjA2My0uMjEgMi4xNDktLjEwNyAyLjc4OS40NzQuMDQxLjAzOC4wMi4xMDYtLjAzNS4xMi01LjU1MyAxLjUxLTQuNDU0IDYuMzQtMi45NzUgMTIuMjY5IDEuMzE2IDUuMjggMS44MTIgNi45ODIgMS45NjggNy41LjAxNS4wNS4wNS4wOS4xLjExIDEuOTExLjc2MSA2LjA3Ni43OTUgNi4wNzYtLjV6IiBjbGlwLXJ1bGU9ImV2ZW5vZGQiLz4KICA8cGF0aCBmaWxsPSIjZmZmIiBkPSJNMTcuODcxIDI3LjMwNWMtLjY3NC4yNjMtMS45OTIuMzgtMi43NTQuMzgtMS4xMTcgMC0yLjcyNC0uMTc1LTMuMzEtLjQzOWExMzEuNDI4IDEzMS40MjggMCAwIDEtMi42Mi05LjM3OHYtLjAwM2MtMS4yNzItNS4xOTMtMi4zMS05LjQzNSAzLjM4MS0xMC43NjcuMDUyLS4wMTIuMDc4LS4wNzQuMDQzLS4xMTUtLjY1My0uNzc1LTEuODc2LTEuMDI5LTMuNDIzLS40OTUtLjA2My4wMjItLjExOC0uMDQyLS4wNzktLjA5Ny4zMDMtLjQxOC44OTYtLjc0IDEuMTg5LS44OC4wNi0uMDMuMDU3LS4xMTgtLjAwNy0uMTM4YTYuNTMyIDYuNTMyIDAgMCAwLS44ODQtLjIxYy0uMDg3LS4wMTQtLjA5NS0uMTYzLS4wMDgtLjE3NSAyLjE5My0uMjk1IDQuNDgzLjM2MyA1LjYzMiAxLjgxYS4wNy4wNyAwIDAgMCAuMDQzLjAyOGM0LjIwOC45MDMgNC41MSA3LjU1NSA0LjAyNCA3Ljg1OC0uMDk1LjA2LS40MDEuMDI1LS44MDUtLjAyLTEuNjM4LS4xODMtNC44OC0uNTQ2LTIuMjA0IDQuNDQuMDI3LjA1LS4wMDguMTE1LS4wNjQuMTI0LTEuNTA4LjIzNC40MjUgNC45NjIgMS44NDYgOC4wNzd6Ii8+CiAgPHBhdGggZmlsbD0iIzNjYTgyYiIgZD0iTTE5Ljc1MyAyMS4yNTdjLS4zMi0uMTQ4LTEuNTUyLjczNS0yLjM3IDEuNDEzLS4xNy0uMjQyLS40OTItLjQxNy0xLjIxOS0uMjktLjYzNi4xMS0uOTg3LjI2My0xLjE0NC41MjctMS4wMDMtLjM4LTIuNjkyLS45NjctMy4xLS40LS40NDYuNjIuMTEyIDMuNTUzLjcwNCAzLjkzNC4zMDkuMTk5IDEuNzg4LS43NTIgMi41Ni0xLjQwOC4xMjUuMTc2LjMyNi4yNzYuNzM4LjI2Ny42MjQtLjAxNSAxLjYzNi0uMTYgMS43OTMtLjQ1YS4zMjYuMzI2IDAgMCAwIC4wMjUtLjA2M2MuNzk0LjI5NyAyLjE5MS42MTEgMi41MDMuNTY0LjgxNC0uMTIyLS4xMTMtMy45Mi0uNDktNC4wOTR6Ii8+CiAgPHBhdGggZmlsbD0iIzRjYmEzYyIgZD0iTTE3LjQ1OSAyMi43NTdjLjAzMy4wNi4wNi4xMjMuMDg0LjE4OC4xMTMuMzE2LjI5NyAxLjMyMy4xNTggMS41NzItLjE0LjI0OS0xLjA0NS4zNjktMS42MDQuMzc5LS41NTkuMDEtLjY4NS0uMTk1LS43OTgtLjUxMi0uMDktLjI1My0uMTM1LS44NDgtLjEzNC0xLjE5LS4wMjMtLjUwNS4xNjItLjY4MyAxLjAxNi0uODIuNjMyLS4xMDMuOTY2LjAxNiAxLjE1OS4yMi44OTctLjY3IDIuMzk0LTEuNjE1IDIuNTQtMS40NDIuNzI4Ljg2LjgyIDIuOTEuNjYyIDMuNzM1LS4wNTEuMjctMi40NjItLjI2Ny0yLjQ2Mi0uNTU4IDAtMS4yMDctLjMxMy0xLjUzOC0uNjIxLTEuNTcyem0tNS4yODEtLjM3N2MuMTk4LS4zMTIgMS43OTkuMDc2IDIuNjc4LjQ2NyAwIDAtLjE4MS44MTguMTA2IDEuNzgyLjA4NS4yODItMi4wMjEgMS41MzctMi4yOTYgMS4zMjEtLjMxOC0uMjUtLjkwMy0yLjkxMy0uNDg4LTMuNTd6Ii8+CiAgPHBhdGggZmlsbD0iI2ZjMyIgZmlsbC1ydWxlPSJldmVub2RkIiBkPSJNMTIuOTU0IDE2LjAzM2MuMTMtLjU2NC43MzMtMS42MjUgMi44ODctMS42IDEuMDktLjAwNCAyLjQ0MyAwIDMuMzQtLjEwMmExMi4wMDggMTIuMDA4IDAgMCAwIDIuOTgzLS43MjVjLjkzMy0uMzU2IDEuMjY0LS4yNzcgMS4zOC0uMDY0LjEyNy4yMzQtLjAyMy42MzgtLjM0OSAxLjAxLS42MjMuNzEtMS43NDIgMS4yNjEtMy43MTggMS40MjRzLTMuMjg2LS4zNjYtMy44NS40OTdjLS4yNDMuMzcyLS4wNTUgMS4yNSAxLjg1NiAxLjUyNiAyLjU4My4zNzMgNC43MDUtLjQ1IDQuOTY3LjA0Ny4yNjIuNDk3LTEuMjQ4IDEuNTA3LTMuODM1IDEuNTI4LTIuNTg3LjAyMS00LjIwMy0uOTA2LTQuNzc2LTEuMzY3LS43MjgtLjU4NC0xLjA1My0xLjQzNy0uODg1LTIuMTc0eiIgY2xpcC1ydWxlPSJldmVub2RkIi8+CiAgPGcgZmlsbD0iIzE0MzA3ZSIgb3BhY2l0eT0iLjgiPgogICAgPHBhdGggZD0iTTE2LjI0OCA5Ljg3NGMuMTQ1LS4yMzcuNDY1LS40Mi45ODktLjQycy43Ny4yMS45NC40NDJjLjAzNS4wNDctLjAxOC4xMDMtLjA3Mi4wOGwtLjAzOS0uMDE4YTEuOTI2IDEuOTI2IDAgMCAwLS44My0uMTkyYy0uNDMtLjAwNi0uNzAyLjEwMi0uODczLjE5NS0uMDU4LjAzMS0uMTQ5LS4wMzEtLjExNC0uMDg3em0tNS44OTUuMzAyYy41MDgtLjIxMy45MDgtLjE4NSAxLjE5LS4xMTguMDYuMDE0LjEwMS0uMDUuMDU0LS4wODktLjIyLS4xNzctLjcxLS4zOTYtMS4zNS0uMTU3LS41NzIuMjEzLS44NC42NTUtLjg0Mi45NDYgMCAuMDY4LjE0LjA3NC4xNzcuMDE2LjA5OC0uMTU3LjI2Mi0uMzg2Ljc3LS41OTh6Ii8+CiAgICA8cGF0aCBmaWxsLXJ1bGU9ImV2ZW5vZGQiIGQ9Ik0xNy42ODEgMTMuMTA2YS44MTMuODEzIDAgMCAxLS44MTQtLjgxMS44MTMuODEzIDAgMCAxIDEuNjI4IDAgLjgxMy44MTMgMCAwIDEtLjgxNC44MTF6bS41NzQtMS4wOGEuMjEuMjEgMCAwIDAtLjQyMiAwIC4yMS4yMSAwIDAgMCAuNDIyIDB6bS01Ljk2OC44M2EuOTQ3Ljk0NyAwIDAgMS0uOTUuOTQ3Ljk0OC45NDggMCAxIDEgMC0xLjg5MmMuNTI0IDAgLjk1LjQyMy45NS45NDV6bS0uMjgtLjMxM2EuMjQ1LjI0NSAwIDEgMC0uNDkgMCAuMjQ1LjI0NSAwIDAgMCAuNDkgMHoiIGNsaXAtcnVsZT0iZXZlbm9kZCIvPgogIDwvZz4KICA8ZyBmaWxsPSIjZmZmIj4KICAgIDxwYXRoIGZpbGwtcnVsZT0iZXZlbm9kZCIgZD0iTTE1IDI3LjU5OGM2Ljk1NyAwIDEyLjU5OC01LjY0IDEyLjU5OC0xMi41OTggMC02Ljk1Ny01LjY0LTEyLjU5OC0xMi41OTgtMTIuNTk4QzguMDQzIDIuNDAyIDIuNDAyIDguMDQyIDIuNDAyIDE1YzAgNi45NTcgNS42NCAxMi41OTggMTIuNTk4IDEyLjU5OHptMCAxLjE3MmM3LjYwNSAwIDEzLjc3LTYuMTY1IDEzLjc3LTEzLjc3UzIyLjYwNSAxLjIzIDE1IDEuMjMgMS4yMyA3LjM5NSAxLjIzIDE1IDcuMzk1IDI4Ljc3IDE1IDI4Ljc3eiIgY2xpcC1ydWxlPSJldmVub2RkIi8+CiAgICA8cGF0aCBkPSJNODIuNjM4IDEzLjE4MWgtMi4xMTVsLTMuODUgMy45OTJWOS4xODloLTEuNjI3djEzLjYxNmgxLjYyNnYtNC40ODRsNC4zOTMgNC40My4wNTQuMDU0aDEuOTUydi0uMTY0bC00LjkzNC00LjkyMXptLTEwLjQ2NCA3LjI5MmMtLjU5Ni42MDEtMS40NjQuOTMtMi40NC45My0xLjY4MSAwLTMuMzYyLTEuMDQtMy4zNjItMy40NDYgMC0yLjAyMyAxLjQxLTMuNDQ1IDMuMzYyLTMuNDQ1Ljg2OCAwIDEuNjgxLjMyOCAyLjMzMi45M2wuMDU0LjA1NSAxLjAzLTEuMDk0LS4wNTQtLjA1NWMtLjk3Ni0uOTMtMi4xMTUtMS4zNjctMy40MTYtMS4zNjctMi45ODMgMC00Ljk5IDIuMDIzLTQuOTkgNC45NzYgMCAzLjQ0NSAyLjQ5NSA0Ljk3NiA0Ljk5IDQuOTc2aC4wNTRjMS4zMDEgMCAyLjU0OS0uNDkyIDMuNDE2LTEuNDIxbC4wNTQtLjA1NS0xLjA4NC0xLjA5NHptLTExLjA2My0yLjEzMmMwIDEuNzUtMS4xOTMgMy4wNjItMi44NzQgMy4xMTctMS43OSAwLTIuODc0LTEuMDkzLTIuODc0LTIuOTUzdi01LjMwNGgtMS42Mjd2NS4zMDRjMCAyLjczNSAxLjYyNyA0LjQ4NCA0LjE3NiA0LjQ4NGguMDU0YzEuMjQ3IDAgMi4zODYtLjYwMSAzLjE0NS0xLjUzbC4wNTQtLjExLjA1NSAxLjQ3NmgxLjUxOHYtOS42MjRINjEuMTF6TTQ1LjA0NiA5LjEzNEg0MC4xMXYxMy42NzFoNC45MzVjNC43MTggMCA2Ljc3OC0zLjUgNi43NzgtNi45NDUgMC0zLjIyNi0yLjExNS02LjcyNi02Ljc3OC02LjcyNnptNS4wOTcgNi42NzJjMCAyLjYyNC0xLjU3MiA1LjI1LTUuMDQzIDUuMjVoLTMuMjU0VjEwLjgyOGgzLjJjMy40NyAwIDUuMDk3IDIuNTcgNS4wOTcgNC45Nzd6bTg0LjQzOSAxLjAzN2g0LjE3NXYzLjE3MmMtMS4wMy44NzUtMi4yNzcgMS4zNjctMy42MzMgMS4zNjctMy42ODggMC01LjM2OS0yLjY4LTUuMzY5LTUuMzA0IDAtMi42OCAxLjY4MS01LjU3OCA1LjMxNS01LjU3OCAxLjQ2NCAwIDIuODIuNTQ3IDMuOTA0IDEuNTMxbC4wNTQuMDU1Ljk3Ni0xLjE0OC0uMDU0LS4wNTVjLTEuMzAxLTEuMzEyLTMuMDM3LTEuOTY5LTQuOTM1LTEuOTY5LTIuMDYgMC0zLjc5Ni42NTctNS4wNDMgMS45NjktMS4zMDEgMS4zMTItMi4wMDYgMy4xNzItMS45NTIgNS4yNSAwIDMuMjI2IDEuODQ0IDYuOTQ0IDcuMDUgNi45NDRoLjEwOGMxLjk1MiAwIDMuNzk2LS44MiA1LjA5OC0yLjI5NnYtNS40MTRoLTUuNzQ5djEuNDc2ek04OS41NzMgOS4xMzRoLTQuOTM1djEzLjY3MWg0LjkzNWM0LjcxNyAwIDYuNzc4LTMuNSA2Ljc3OC02Ljk0NSAwLTMuMjI2LTIuMTE1LTYuNzI2LTYuNzc5LTYuNzI2em01LjA5NyA2LjY3MmMwIDIuNjI0LTEuNTczIDUuMjUtNS4wNDMgNS4yNWgtMy4yVjEwLjgyOGgzLjJjMy40MTYgMCA1LjA0MyAyLjU3IDUuMDQzIDQuOTc3em01Mi4yOTEtMi44MjVjLTIuODc0IDAtNC45MzUgMi4xMzMtNC45MzUgNS4wMzFzMi4wNjEgNC45NzYgNC45MzUgNC45NzYgNC45ODktMi4wNzggNC45ODktNC45NzZjMC0yLjk1My0yLjA2MS01LjAzLTQuOTg5LTUuMDN6bTMuMzYyIDUuMDMxYzAgMi4wMjMtMS40MSAzLjQ0NS0zLjM2MiAzLjQ0NS0xLjg5OCAwLTMuMzA4LTEuNDIyLTMuMzA4LTMuNDQ1IDAtMi4wNzggMS4zNTYtMy41NTQgMy4zNjItMy41NTQgMS44OTguMDU0IDMuMzA4IDEuNTMgMy4zMDggMy41NTR6bS00NC42ODUuMzI5YzAgMS43NS0xLjE5MyAzLjA2Mi0yLjg3NCAzLjExNy0xLjc5IDAtMi44NzQtMS4wOTMtMi44NzQtMi45NTN2LTUuMzA0aC0xLjYyN3Y1LjMwNGMwIDIuNzM1IDEuNjI3IDQuNDg0IDQuMTIxIDQuNDg0aC4wNTRjMS4yNDggMCAyLjM4Ni0uNjAxIDMuMTQ1LTEuNTNsLjA1NS0uMTEuMDU0IDEuNDc2aDEuNTE4di05LjYyNGgtMS42Mjd2NS4xNHptMTEuMDYzIDIuMTMyYy0uNTk3LjYwMS0xLjQ2NC45My0yLjQ0MS45My0xLjY4MSAwLTMuMzYyLTEuMDQtMy4zNjItMy40NDYgMC0yLjAyMyAxLjQxLTMuNDQ1IDMuMzYyLTMuNDQ1Ljg2OCAwIDEuNjgyLjMyOCAyLjMzMi45M2wuMDU1LjA1NSAxLjAzLTEuMDk0LS4wNTQtLjA1NWMtLjk3Ni0uOTMtMi4xMTUtMS4zNjctMy40MTctMS4zNjctMi45ODIgMC00Ljk4OSAyLjAyMy00Ljk4OSA0Ljk3NiAwIDMuNDQ1IDIuNDk1IDQuOTc2IDQuOTg5IDQuOTc2aC4wNTRjMS4zMDIgMCAyLjU0OS0uNDkyIDMuNDE3LTEuNDIxbC4wNTQtLjA1NS0xLjA4NC0xLjA5NHptMTAuNDYzLTcuMjkyaC0yLjExNWwtMy44NSAzLjk5MlY5LjE4OWgtMS42Mjd2MTMuNjE2aDEuNjI3di00LjQ4NGw0LjM5MyA0LjQzLjA1NC4wNTRoMS45NTJ2LS4xNjRsLTQuOTM1LTQuOTIxeiIvPgogIDwvZz4KPC9zdmc+Cg==']");
By logoLocator = By.xpath("//div[contains(@class,'Desktop')]//img");
        boolean isLogoDisplayed = driver.findElement(logoLocator).isDisplayed();
    }

    /**
     * open chrome browser
     * go to <a href="https://duckduckgo.com/">...</a>
     * Search for [Selenium WebDriver]
     * Assert that the link of the first result is [https://www.selenium.dev/documentation/webdriver/]
     * close Google Chrome
     */
@Test
public void testThreeSearch (){

    //we can here go to selenium Webdriver directly as we tested the search bar before
    driver.get("https://duckduckgo.com/");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    By searchInputLocator = By.id("searchbox_input");
    driver.findElement(searchInputLocator).sendKeys("Selenium WebDriver", Keys.ENTER);
    By firstResultLocator = By.xpath("(//div[@class='ikg2IXiCD14iVX7AdZo1']//a)[1]");

 String actualLink = driver.findElement(firstResultLocator).getDomAttribute("href");
String expectedLink = "https://www.selenium.dev/documentation/webdriver/";
 Assert.assertEquals(actualLink,expectedLink,"the link is not matching");
}

    /**
     * open chrome browser
     * go to <a href="https://duckduckgo.com/">...</a>
     * Search for [Cucumber IO]
     * Assert that the link of the second result contains [https://www.linkedin.com]
     */
@Test
public void testFiveSearch (){
    driver.get("https://duckduckgo.com/?t=h_&q=Cucumber+IO&ia=web");
    By secondResultLocator = By.xpath("(//div[@class='ikg2IXiCD14iVX7AdZo1']//a)[2]");
    String actualLink = driver.findElement(secondResultLocator).getDomAttribute("href");
    String expectedLinkPart = "https://www.linkedin.com";
   boolean isLinkContains = actualLink.contains(expectedLinkPart);
    Assert.assertTrue(isLinkContains,"the link does not contain linkedin");
}

    /**
     * Open Google Chrome
     * Navigate to [<a href="http://the-internet.herokuapp.com/checkboxes">...</a>]
     * Check Checkbox 1
     * Assert that both Checkboxes are checked
     * Close Google Chrome
     */
    @Test
    public void testSixCheckboxes (){
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        By checkbox1Locator = By.xpath("(//form[@id='checkboxes']//input)[1]");
//using explicitwaits
        Wait<WebDriver> wait =new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10)).
                pollingEvery(Duration.ofSeconds(2)).ignoring(StaleElementReferenceException.class);
wait.until(driver-> {
    driver.findElement(checkbox1Locator).click();
    return true ;
});


//   driver.findElement(checkbox2Locator).click();
        By checkbox2Locator = By.xpath("(//form[@id='checkboxes']//input)[2]");
        boolean isCheckbox1Selected = driver.findElement(checkbox1Locator).isSelected();
        boolean isCheckbox2Selected = driver.findElement(checkbox2Locator).isSelected();

        Assert.assertTrue(isCheckbox1Selected,"checkbox 1 is not selected");
      Assert.assertTrue(isCheckbox2Selected,"checkbox 2 is not selected");

// try findElemnts ??
    }

    /**
     * Open Google Chrome
     * Navigate to [<a href="https://www.w3schools.com/html/html_tables.asp">...</a>]
     * Assert that the Country for the Company [Ernst Handel] is [Austria]
     * Close Google Chrome
     */

@Test
public void testSevenWebTable (){

    driver.get("https://www.w3schools.com/html/html_tables.asp");
    By companyLocator = By.xpath("//table[@id='customers']//tr//td");
//    By countryLocator = By.xpath("//table[@id='customers']//tr//td[]");
   List<WebElement>  row = driver.findElements(companyLocator);
    int i ;
for  (i =0; i<row.size(); i++){
    if (row.get(i).getText().contains("Ernst Handel")){
        break;
    }

    }
String actualCountry = row.get(i+2).getText();
    Assert.assertEquals(actualCountry,"Austria","the country is not matching");


//    System.out.println( );
}

    /**
     * Open Google Chrome
     * Navigate to [<a href="http://the-internet.herokuapp.com/upload">...</a>]
     * Upload a small image file
     * Assert that the file was uploaded successfully
     * Close Google Chrome
     */

    //why here when i use expected text File Uploaded! failed
@Test
public void testEightFileUpload (){

    File uploadedFile = new File("C:/Users/mzzzz/Downloads/softwareQualityEngineer.pdf");
    driver.get("http://the-internet.herokuapp.com/upload");
    By chooseFileButtonLocator = By.id("file-upload");
    Wait<WebDriver> wait =new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10)).
            pollingEvery(Duration.ofSeconds(2)).
            ignoring(StaleElementReferenceException.class);
    wait.until(driver-> {
        driver.findElement(chooseFileButtonLocator).sendKeys(uploadedFile.getAbsolutePath());
        String actualPath    =driver.findElement(chooseFileButtonLocator).getDomProperty("value");
        Assert.assertTrue(actualPath.contains("softwareQualityEngineer.pdf"),"the file path is not matching");
        return true ;
            });
    Wait<WebDriver> wait2 =new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10)).
            pollingEvery(Duration.ofSeconds(2)).
            ignoring(StaleElementReferenceException.class);
    By fileUpdatedLocator = By.xpath("//div[@id='content']//h3");

    wait2.until(driver-> {
   driver.findElement(fileUpdatedLocator).isDisplayed();
        String actualMessage = driver.findElement(fileUpdatedLocator).getText();
        String expectedMessage = "File Uploaded!";
        Assert.assertEquals(actualMessage,expectedMessage,"the message is not matching");
        return true ;
    });
}
    /**
     * Open Google Chrome
     * Navigate to [<a href="http://the-internet.herokuapp.com/upload">...</a>]
     * Upload a small image file
     * Assert that the file was uploaded successfully
     * Close Google Chrome
     */
    @Test
    public void testEightFileUploadAlternative(){
        driver.get("http://the-internet.herokuapp.com/upload");
        By uploadButtonLocator = By.id("file-upload");
        File uploadedFile = new File("C:/Users/mzzzz/Downloads/softwareQualityEngineer.pdf");
        driver.findElement(uploadButtonLocator).sendKeys(uploadedFile.getAbsolutePath());
        By submitButtonLocator = By.id("file-submit");
        driver.findElement(submitButtonLocator).click();
        Wait<WebDriver> wait =new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10)).
                pollingEvery(Duration.ofSeconds(2)).
                ignoring(StaleElementReferenceException.class);
        By fileUpdatedLocator = By.xpath("//div[@id='content']//h3");
        By fileNameLocator = By.id("uploaded-files");
        wait.until(driver-> {
            driver.findElement(fileUpdatedLocator).isDisplayed();
            String actualName = driver.findElement(fileNameLocator).getText();
            String expectedName = "softwareQualityEngineer.pdf";
            Assert.assertEquals(actualName,expectedName,"the file name is not matching");

            return true ;
        });
    }

    /**
     * Open Google Chrome
     * Navigate to [<a href="https://jqueryui.com/resources/demos/droppable/default.html">...</a>]
     * Drag [Drag me to my target] and drop it on [Drop here]
     * Assert that the text has been changed to [Dropped!]
     * Close Google Chrome
     */
@Test
public void testNineDragAndDrop () {
    driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
    By dragMeLocator = By.id("draggable");
    By dropHereLocator = By.id("droppable");
    By droppedTextLocator = By.xpath("//div[@id='droppable']/p");
    WebElement dragMe = driver.findElement(dragMeLocator);
    WebElement dropHere = driver.findElement(dropHereLocator);
    new Actions(driver).dragAndDrop(dragMe, dropHere).perform();
//    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//    wait.until(ExpectedConditions.textToBePresentInElement(dropHere, "Dropped!"));

//    assertion in different explicit wait
//    String actualText = driver.findElement(droppedTextLocator).getText();
//    String expectedText = "Dropped!";
//    Assert.assertEquals(actualText,expectedText,"the text is not matching");

//    String expectedText = "Dropped!";
//    Assert.assertEquals(actualText,expectedText,"the text is not matching");

//    what is exception thrown here for text to be existed
    Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10)).
            pollingEvery(Duration.ofSeconds(2)).
            ignoring(NoSuchElementException.class);
    wait.until(driver -> {
        String actualText = driver.findElement(droppedTextLocator).getText();
        String expectedText = "Dropped!";
        Assert.assertEquals(actualText,expectedText,"the text is not matching");
        return true ;
    });
}

@BeforeMethod
    public void setup(){
       driver = new ChromeDriver();
    }
@AfterMethod
    public void tearDown() {
    driver.quit();

}
}
