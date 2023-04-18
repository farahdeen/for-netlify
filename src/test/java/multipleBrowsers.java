import com.microsoft.playwright.*;

public class multipleBrowsers {
    public static void main(String[] args) {



    Playwright pw = Playwright.create();


       //firefox browser
        Browser browserss = pw.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext b1 = browserss.newContext();
        Page page = b1.newPage();
        page.navigate("https://www.argos.co.uk/");
        page.locator("text = Accept").click();


        //webkit browser
        Browser browsers2 = pw.webkit().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext b2 = browsers2.newContext();
        Page page2 = b2.newPage();
        page2.navigate("https://www.alexanderwatch.com/");



        //chromium browser

        Browser browserb3 = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        BrowserContext b3 = browserb3.newContext();
        Page page3 = b2.newPage();
        page3.navigate("https://www.alexanderwatch.com/");
        browserb3.close();
        pw.close();
    }
}