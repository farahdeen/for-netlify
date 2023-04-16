import com.microsoft.playwright.*;

public class MultipleLocators {

    public static void main(String[] args) {
        Playwright playwright = Playwright.create();
        {
            Browser browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(50));
            Page page = browser.newPage();
            page.navigate("https://www.alexanderwatch.com/");
            System.out.println(page.title());

            // select particular text
            Locator ab = page.locator("' SHOP WOMEN'");
            for (int i = 0; i < ab.count(); i++) {
                String text = ab.nth(i).textContent();
                if (text.contains("ABOUT")) {
                    ab.nth(i).click();
                    break;
                }


playwright.close();
            }

        }
    }}