import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;

import java.nio.file.Paths;

public class LetsTrace {

    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                    .setHeadless(false));
            BrowserContext context = browser.newContext();
            Page page = context.newPage();

            // Start tracing before creating / navigating a page.
            context.tracing().start(new Tracing.StartOptions()
                    .setScreenshots(true)
                    .setSnapshots(true)
                    .setSources(true));


            page.navigate("https://www.alexanderwatch.com/");
            page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("")).click();
            page.getByLabel("Username or email address *").click();
            page.getByLabel("Username or email address *").fill("deensfr\"hotmail.com");
            page.locator("#password").fill("asd");
            page.locator("#password").click();
            page.locator("#password").fill("asddsfsdfds");
            page.locator("#password").click();
            page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Login")).click();
            page.locator("#menu-item-3316").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("WOMEN")).click();



            // Stop tracing and export it into a zip archive.
            context.tracing().stop(new Tracing.StopOptions()
                    .setPath(Paths.get("deentrace.zip")));

        }
    }
}

