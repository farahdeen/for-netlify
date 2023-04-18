import com.microsoft.playwright.*;

import java.nio.file.Paths;
import java.util.List;

public class VideoRec {
    public static void main(String[] args) {

        Playwright playwright = Playwright.create();
        Browser browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(50));



        //for recording
BrowserContext browserContext = browser.newContext(new Browser.NewContextOptions()
        .setRecordVideoDir(Paths.get("myvideo/")));

        Page page =browserContext.newPage();

        page.navigate("https://www.alexanderwatch.com/");

        page.locator("//input[@name='EMAIL']").fill("deen");



        //Locator totallinks = page.locator("//a[contains(text(),'Women')]");
        Locator totallinks = page.locator("//a");
        System.out.println(totallinks.count());

        List<String> total = totallinks.allInnerTexts();
        for (String e : total) {
            System.out.println(e);
        }


        page.locator("//a[text()='ABOUT']").first().click();


        //example of going through a div to select element
        page.locator("//div[@class='col small-12 large-12']" +
                "//form[@id='mc4wp-form-1']//div[@class='mc4wp-form-fields']//input[@type='submit']").click();

        browserContext.close();
        page.close();
        playwright.close();
    }
}
