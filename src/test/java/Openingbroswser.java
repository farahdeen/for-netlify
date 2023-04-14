import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Openingbroswser {

    public static void main(String[] args) {

            //By default, Playwright runs the browsers in headless mode. To see the browser UI, pass the headless=false
            // flag while launching the browser. You can also use slow Mo to slow down execution. Learn more in the
        // debugging tools section.

        Playwright playwright = Playwright.create(); {
            Browser browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(50));
            Page page = browser.newPage();
            page.navigate("https://www.alexanderwatch.com/");
            System.out.println(page.title());
            browser.close();
            playwright.close();
        }
    }}