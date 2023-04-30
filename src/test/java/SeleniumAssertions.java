import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertNotEquals;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class SeleniumAssertions {

    /*
    In TestNG, an assertion is a statement that verifies or validates whether
    an expected condition is true or false. Assertions are used to check if a
    test case is passing or failing based on the expected results
    */

    WebDriver driver = new EdgeDriver();

    @BeforeTest
    public  void Homepage() {

        driver.get("https://www.alexanderwatch.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

        @Test //This code checks if the title of the web page matches the expected title.

               public void assertEqual() {
            String expectedTitle = "Alexander Watch | Fine Watches for Men and Women";
            String actualTitle = driver.getTitle();
            assertEquals(expectedTitle, actualTitle);
        }

@Test//This code checks if the welcome message
// displayed on the web page is not equal to the expected text.
        public void assertNotEqual() {
    String expectedText = "Welcome to Selenium Tutorial";
    String actualText = driver.findElement(By.xpath("//*[@id=\"menu-item-6277\"]//a[contains(text(),'ABOUT')]")).getText();
    assertNotEquals(expectedText, actualText);
    System.out.println(actualText);
}

@Test//This code checks if the login button is displayed,enabled on the web page.

public void testLoginButtonIsenabled(){
   // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"menu-item-3315\"]//a[contains(text(),'MEN')]"));
    Assert.assertTrue(loginButton.isEnabled());
    System.out.println("Button is enabled");
}

@Test//This code checks if the error message is not displayed on the web page.
public void assertFalse(){

    WebElement errorMessage = driver.findElement(By.xpath("//*[@id=\"menu-item-3315\"]//a[contains(text(),'MEN')]"));
    Assert.assertFalse(errorMessage.isSelected());
    System.out.println("Button not selected");
}

@Test //This code checks if the "About Us" menu item is present on the web page.

public void Assert_in() {
//    driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    //driver.navigate().to("https://www.argos.co.uk/");
    driver.manage().deleteAllCookies();
    driver.findElement(By.id("consent_prompt_submit")).click();

        List<WebElement> menuItems = driver.findElements(By.xpath("//button"));
    for (WebElement elements:menuItems) {
        System.out.println(elements.getText());}
    String expectedMenuItem = "Learn more";
    assertTrue(menuItems.stream().anyMatch(e -> e.getText().equals(expectedMenuItem)));

    }

    @Test//This code checks if the "Contact Us" menu item is not present on the web page.

    public void Assert_not_in(){
      //  driver.navigate().to("https://www.argos.co.uk/");
       driver.manage().deleteAllCookies();
        driver.findElement(By.id("consent_prompt_submit")).click();
        List<WebElement> menuItems2 = driver.findElements(By.xpath("//li"));
        for (WebElement elements1:menuItems2) {
            System.out.println(elements1.getText());
        }
            String unexpectedMenuItem = "us";
           Assert.assertFalse(menuItems2.stream().anyMatch(e -> e.getText().equals(unexpectedMenuItem)));
    }

    @Test//This code checks if the error message is null.

    public void assertIsNone(){

        WebElement errorMessage = driver.findElement(By.id("error-message"));
        Assert.assertNull(errorMessage.getText());

    }

@Test//This code checks if the login button's ID attribute is not null.

public void assertIsNotNone (){
WebElement loginButton = driver.findElement(By.id("menu-item-6277"));
Assert.assertNotNull(loginButton.getAttribute("id"));
    }




        @AfterTest
    public void closeBrowser(){
        driver.close();
}
    }








