public class CmdCommands {
    public static void main(String[] args) {
        System.out.println("use this commnds");
    }
}
/* Playwright recoding command

mvn exec:java -e -D exec.mainClass=com.microsoft.playwright.CLI -D exec.args="codegen https://www.alexanderwatch.com/”

Playwright Trace command
mvn exec:java -e -D exec.mainClass=com.microsoft.playwright.CLI -D exec.args="show-trace deentrace.zip"
*/