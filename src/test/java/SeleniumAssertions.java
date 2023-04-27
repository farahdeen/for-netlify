import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertNotEquals;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class SeleniumAssertions {

    WebDriver driver = new EdgeDriver();

    @BeforeTest
    public  void Homepage() {

        driver.get("https://www.alexanderwatch.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

        @Test //assertEqual:

               public void assertEqual() {
            String expectedTitle = "Alexander Watch | Fine Watches for Men and Women";
            String actualTitle = driver.getTitle();
            assertEquals(expectedTitle, actualTitle);
        }

@Test
        public void assertNotEqual() {
    String expectedText = "Welcome to Selenium Tutorial";
    String actualText = driver.findElement(By.xpath("//*[@id=\"menu-item-6277\"]//a[contains(text(),'ABOUT')]")).getText();
    assertNotEquals(expectedText, actualText);
    System.out.println(actualText);
}

@Test

public void testLoginButtonIsenabled(){
   // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    WebElement loginButton = driver.findElement(By.xpath("//*[@id=\"menu-item-3315\"]//a[contains(text(),'MEN')]"));
    Assert.assertTrue(loginButton.isEnabled());
    System.out.println("Button is enabled");
}

@Test
public void assertFalse(){

    WebElement errorMessage = driver.findElement(By.xpath("//*[@id=\"menu-item-3315\"]//a[contains(text(),'MEN')]"));
    Assert.assertFalse(errorMessage.isSelected());
    System.out.println("Button not selected");
}

@Test //assert in

public void Assert_in() {
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.navigate().to("https://www.argos.co.uk/");
    driver.manage().deleteAllCookies();
        List<WebElement> menuItems = driver.findElements(By.xpath("//button"));
    for (WebElement elements:menuItems) {
        System.out.println(elements.getText());
    }
    String expectedMenuItem = "Learn more";
    assertTrue(menuItems.stream().anyMatch(e -> e.getText().equals(expectedMenuItem)));

}





    @AfterTest
    public void closeBrowser(){
        driver.close();
}
    }








