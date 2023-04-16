import com.microsoft.playwright.*;

import java.util.List;

public class MultipleLocators {

    public static void main(String[] args) {

        Playwright playwright = Playwright.create();
        Browser browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));


        BrowserContext firstbrowser = browser.newContext();
        Page fage = firstbrowser.newPage();
        fage.navigate("https://www.alexanderwatch.com/");

        System.out.println(fage.title());

        // select particular text if match
        Locator ab = fage.locator("' ABOUT'");
        for (int i = 0; i < ab.count(); i++) {
            String text = ab.nth(i).textContent();
            if (text.contains("ABOUT")) {
                ab.nth(i).click();

            }

            //count locators
            BrowserContext b1a = browser.newContext();
            Page page5 = b1a.newPage();
            page5.navigate("https://www.orangehrm.com/orangehrm-30-day-trial");
            page5.locator("text = Accept Cookies").click();
            Locator l1 = page5.locator("text = OrangeHRM ");
            int totallink = l1.count();
            System.out.println(totallink);
            l1.first().click();

            //multiple locators
            BrowserContext b2 = browser.newContext();
            Page page2 = b2.newPage();
            page2.navigate("https://www.orangehrm.com/orangehrm-30-day-trial");
            page2.locator("text = Accept Cookies").click();
            Locator countryOptions = page2.locator("select#Form_getForm_Country option");
            System.out.println(countryOptions.count());
            for (int b = 0; b < countryOptions.count(); b++) {
                String lsitofcountry = countryOptions.nth(b).textContent();
                System.out.println(lsitofcountry);
            }
            //iterate through
            BrowserContext b3 = browser.newContext();
            Page page3 = b3.newPage();
            page3.navigate("https://www.orangehrm.com/orangehrm-30-day-trial");
            page3.locator("text = Accept Cookies").click();
            Locator countrysOptions = page2.locator("select#Form_getForm_Country option");
            List<String> optionlist = countrysOptions.allInnerTexts();
            for (String e : optionlist) {
                System.out.println(e);
            }
            //using lambda
            BrowserContext b4 = browser.newContext();
            Page page4 = b4.newPage();
            page4.navigate("https://www.orangehrm.com/orangehrm-30-day-trial");
            page4.locator("text = Accept Cookies").click();
            Locator countryOptionss = page2.locator("select# Form_getForm_Country option");
            optionlist.forEach(ele -> System.out.println(ele));


            playwright.close();
        }

    }
}