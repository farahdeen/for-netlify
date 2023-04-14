
import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import java.util.*;
public class Rec {

    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                    .setHeadless(false));
            BrowserContext context = browser.newContext();
            Page page = context.newPage();
            page.navigate("https://demo.playwright.dev/todomvc/");
            page.navigate("https://demo.playwright.dev/todomvc/#/");
            page.navigate("https://www.google.com/search?q=lexaNDER+WATCH&oq=lexaNDER+WATCH&aqs=chrome..69i57.3110j0j4&sourceid=chrome&ie=UTF-8");
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Reject all")).click();
            page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("Alexander Watch | Fine Watches for Men and Women Alexander Watch https://www.alexanderwatch.com")).click();
            page.getByText("ABOUT BLOG", new Page.GetByTextOptions().setExact(true)).click();
            page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("BRAND STORY")).click();
        }
    }
}