public class CreateXpaths {
    public static void main(String[] args) {
        System.out.println("xpath");


        //So, when you use the expression //* in XPath,
        // it will select all elements in the document, regardless of their position or hierarchy,
        // as long as they are elements. The asterisk (*) represents a wildcard that matches any element name.

        //*[@id="tab_men's-watches"]
        //a[contains(text(),'Women']
        //input[@class='search-field mb-0']

        /*
https://www.softwaretestinghelp.com/xpath-writing-cheat-sheet-tutorial-examples/#1_Reverse_Lookup



“//*[@id=’rcTEST’]//*[contains(text(), ‘TEST Interactive’)]/../button[2]”
“//*[@id=’rcTEST’]//*[contains(text(), ‘TEST Interactive’)]/..//*[contains(text(), ‘Setting’)]”
“//*[@id=’rcTEST’]//*[contains(text(), ‘TEST Interactive’)]/following-sibling::button”
“String actualFileName = WebDriverAccess.getDriver().findElement(By.xpath(“//*”+fileName +”/tr/td[1]”)).getAttribute(“title”);”
WebDriverAccess.getDriver().findElement(By.xpath(“//*”+fileName +”/tr/td[4]”)).click();
“// address[@class=’ng-scope ng-isolate-scope’]//div[contains(.,Testing’) and @id=’msgTitle’]”
“//*[@name=’myForm’]//table[@id=’tbl_ testdm’]/tbody/tr/td[6]/
input[@value=’Open RFS’]”
“//*[@title=’Songs List Applet’]//table//td[contains(text(),’Author’)]”
“//*[@id=’parameters’]//*[@id=’testUpdateTime’]”)”
“//*[@id=’MODEL/PLAN’]/div[1]/div[2]/div[1]/div[1]/widget/section/div[1]/div/div[1]/div/div/button[1]”
“//*[contains(text(),’Watch Dial)]/../div/select[@data-ng-model=’context.questions[subqts.subHandleSubId]’]”),”
“//*[@id=’RESEARCH/PLAN’]//*[contains(@id, ‘A4’)]/../../following-sibling::div[1]/div[1]/span[1]/span[1]”
“//*[@id=’ALARMDATA’]//*[contains(@id, ‘AFC2’)]/../../preceding-sibling::div[1]/div[1]/span[1]/span[1]”
“//*[@id=’RESEARCH/REVIEW’]//widget/section/div[1]/div/div[2]/div[1]/div[3]/div[1]//span[@class=’details’]”
“//a[contains(.,’Parameter Data Manual Entry’)]”
“//*[contains(@style,’display: block; top:’)]//input[@name=’daterangepicker_end’]”
“//*[@id=’dropdown-filter-serviceTools’]/following-sibling::ul/descendant::a[text()=’Notepad’]”
“//*[@id=’dropdown-filter-serviceTools’]/following-sibling::ul/descendant::a[text()=’Trigger Dashboard’]”
“//h3[text()=’Internal Debrief’]”
“//h3[contains(text(),’Helium Level’)]/following-sibling::div/label/input”
“//div[div[p[contains(text(),’Status’)]]]/preceding-sibling::div/div/span[3]/span”
“//*[@id=’COUPLING’]//*[contains(text(),’COUPLE Trend’)]/../div/select”
“//*[@id=’ffaHeaderDropdown’]//a[contains(text(),’Start Workflow’)]”










     //    #3) Using “XML” tags, “AND” etc
// We can generate unique XPATH using customized tags plus add other conditions.

For Example, let’s say our intended web element exists in the main <address> tag, and there are multiple address tags, but you want to find only a specific one. All address tags have a class attribute, thus we can start with.

// address[@class='ng-scope ng-isolate-scope']
We noticed that our intended web element is in a <DIV> tag which has some text called ‘Testing’.

// address[@class='ng-scope ng-isolate-scope']//div[contains(.,'Testing')
We figured out that there are multiple web elements found as a result. Hence to make it more unique, we can add the other conditions such as “id” which will finally point us to the web element that we are looking for.

 // address[@class='ng-scope ng-isolate-scope']//div[contains(.,Testing') and @id='msgTitle']
#4) Using Attributes and Table XPATH
Let’s assume that we want to type into a web element that is placed inside a table and the table is placed inside a form element.

We can find all the forms inside DOM with the name ‘myForm’.

“//*[@name='myForm']”
Now in all the forms find the table with id ‘tbl_testdm’.

"//*[@name='myForm']//table[@id='tbl_ testdm’]”
Within the table go to a specific row and column.

"//*[@name='myForm']//table[@id='tbl_ testdm’]/tbody/tr/td[6]/”
Within the cell, if there are multiple inputs, then find an input where value = ‘Open RFS’, and this will give us the final XPath of the field.

 //*[@name='myForm']//table[@id='tbl_ testdm’]/tbody/tr/td[6]/ input[@value='Open RFS']"
#5) Using Attributes, Tables, and Text
Assume that your intended web element lies in the Panel Table and has some common text.

First start with a panel having a unique attribute which in this case is ‘TITLE’.

//*[@title=’Songs Lis Applet']
Now navigate through all the table tags.

//*[@title=’Songs Lis Applet']//table
Within all the tables find the column which has the text ‘Author’.

Final XPath would be like this:

 //*[@title=’Songs List Applet']//table//td[contains(text(),'Author')]
#6) Generating XPATH Using Nested Attributes
Target web element’s XPath can also be generated using the nested attributes. For Example, in this case, it’ll look for a specific attribute across DOM and then look for another attribute within it.

 //*[@id='parameters']//*[@id='testUpdateTime']")
#7) XPath Generation by Combining Attributes, Divs, and Button
For Example, in the below XPath, I was able to find the target web element by using an id (relative XPath), some div tags, and a button.

“//*[@id='MODEL/PLAN']/div[1]/div[2]/div[1]/div[1]/widget/section/div[1]/div/div[1]/div/div/button[1]"
#8) XPATH Generating using CONTAINS, REVERSE LOOKUP, etc.
Once I had a drop-down with no direct identification. I had to use CONTAINS, REVERSE, DIVs, attributes to come up with the final XPATH as shown below.

//*[contains(text(),'Watch Dial)]/../div/select[@data-ng-model='context.questions
[subqts.subHandleSubId]']"),
#9) XPath Generation using Relative, CONTAINS, REVERSE, FOLLOWING SIBLING, etc.
I had a situation where the application displays a graph, and each graph value had to be validated. But, unfortunately, each value didn’t have any unique identification, so I have come up with the final XPATH as shown below for one graph value that combines relative, contains, reverse, following-sibling, and div tags.

 //*[@id='RESEARCH/PLAN']//*[contains(@id, 'A4')]/../../following-sibling::div[1]/div[1]/span[1]/span[1]
#10) XPath Generation using Attributes, Contains, Reverse, Preceding-Sibling, Divs, and Span
Once I had to validate different Alarm data and each alarm value has been displayed based on a specific calculation or timings. In order to capture each value, I had to come up with the below XPATH that uses attributes, contains, reverse, preceding-sibling, divs, and span tags.

 //*[@id='ALARMDATA']//*[contains(@id, 'AFC2')]/../../preceding-sibling::div[1]/div[1]/span[1]/span[1]
#11) Using Attributes, XML Tags etc.
In the below XPATH, attributes, and XML tags, a sequence is used to come up with the final unique address of a web element.

//*[@id='RESEARCH/REVIEW']
//widget/section/div[1]/div/div[2]/div[1]/div[3]/div[1]//span[@class='details']
#12) XPath Generation by not Looking into the Entire Page but Looking into all the Links instead and Contains
The below XPath would look for only links in an entire page that contain the text as “Parameter Data Manual Entry”.

//a[contains(.,'Parameter Data Manual Entry')]
#13) Using Contains and Attributes
 //*[contains(@style,'display: block; top:')]//input[@name='daterangepicker_end']
#14) Using Attributes, Following Siblings and Descendant
 //*[@id='dropdown-filter-serviceTools']/following-sibling::ul/descendant::a[text()='Notepad']
#15) Using Attributes, Following Siblings, Descendant, and Text
 //*[@id='dropdown-filter-service tools']
/following-sibling::ul/descendant::a[text()='Trigger Dashboard']
#16) Using Header and Text
If the web element is a header with some specific text, then the XPath could be as shown below:

//h3[text()='Internal Debrief']
#17) Using Header Text, Following Siblings, Path, etc.
//h3[contains(text(),'Helium Level')]/following-sibling::div/label/input
#18) Using Attributes, Contains, and Preceding Siblings
Once I had a span that didn’t have any unique attribute, I had created XPATH by combining absolute, Contains, preceding siblings, and another absolute path.

//div[div[p[contains(text(),'Status')]]]/preceding-sibling::div/div/span[3]/span
#19) Looking for drop-down by using Id Attribute, some Specific Text, and Reverse Lookup
//*[@id='COUPLING']//*[contains(text(),'COUPLE Trend')]/../div/select
#20) Combining “id” Attribute and looking for a link with Specific Text
//*[@id='ffaHeaderDropdown']//a[contains(text(),'Start Workflow')]

         */
    }
}
