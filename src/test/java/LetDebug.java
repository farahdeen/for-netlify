import com.microsoft.playwright.*;
import com.microsoft.playwright.options.AriaRole;

public class LetDebug {


        public static void main(String[] args) {
            try (Playwright playwright = Playwright.create()) {
                Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
                        .setHeadless(false));
                BrowserContext context = browser.newContext();
                Page page = context.newPage();

                //use this page.pause ();method for debug or modify run configuration set environment PWDEBUG and value 1
                page.pause();

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
                page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Subscribe")).click();
                page.locator("#row-1482182435").getByRole(AriaRole.LINK, new Locator.GetByRoleOptions().setName("MEN").setExact(true)).click();
                page.getByRole(AriaRole.LINK, new Page.GetByRoleOptions().setName("ABOUT")).click();
            }
        }
    }
