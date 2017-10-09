package Practice;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecutorTest {
 
 
    public static void main(String s[]) {
 
        WebDriver driver = new FirefoxDriver();
 
        driver.get("http://www.facebook.com/");
        JavascriptExecutor js=(JavascriptExecutor) driver;
 
        //Print title of a page
        String title = (String)js.executeScript("return document.title");
        System.out.println("title  : " + title);
 
        //Type Email Id
        js.executeScript("document.getElementById('email').value='pragnyaachan@facebook.com'");
 
        //Type Password
        js.executeScript("document.getElementById('pass').value='Pragnya@522'");
 
        //Click on Login button
        js.executeScript("document.getElementById('loginbutton').click();");
 
    }
 
}


