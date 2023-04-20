import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import org.testng.annotations.Test;

public class Reports {

    @Test
    public void test() {
        // create a new ExtentHtmlReporter to generate the report
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent-report.html");

        // create an instance of ExtentReports and attach the reporter to it
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);

        // create a new test in the extent report
        ExtentTest test = extent.createTest("My Test", "Sample test case");

        // launch a new browser

             Playwright playwright = Playwright.create();
             Browser browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false).setSlowMo(50));
             Page page = browser.newPage();
             page.navigate("https://demoqa.com/frames");

             //https://www.youtube.com/watch?v=WZbAGjFwN-o&list=PLFGoYjJG_fqrjcgRUcc2ubbZGtbRcC6W8&index=11
             //used xpath and css selector to go into frames
             String hg =  page.frameLocator("//*[@id=\"frame2\"]").locator("h1").textContent();
             System.out.println(hg);
             String hgx =  page.frameLocator("//*[@id=\"frame1\"]").locator("h1").textContent();
             System.out.println(hgx);


             playwright.close();
             // flush the report to write the results to the HTML file
             extent.flush();
        }
    }

