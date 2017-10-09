package Practice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
  
public class Browsing {
   
  public static void main(String s[]) {
        String baseUrl = "http://www.google.com";
        String expectedPageTitle = "Google";
        String actualPageTitle = "";
        System.setProperty("webdriver.gecko.driver", "c:\\geckodriver.exe");
        //Initialize driver object
        WebDriver driver = new FirefoxDriver();
       
        //Launch Application on browser
        driver.get(baseUrl);
       
        //Fetch page title and store it in a variable
        actualPageTitle = driver.getTitle();
        //Print title
        System.out.println(actualPageTitle);
       
        if (actualPageTitle.equals(expectedPageTitle)) {
             System.out.println("Test case passed");
         } else {
         System.out.println("Test case Failed");
         }
       
         //close browser
         driver.close();   
  }
  
}


