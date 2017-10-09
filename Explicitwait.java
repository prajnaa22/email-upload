package Practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {


             public static void main(String[] args) {
            	 System.setProperty("webdriver.gecko.driver", "c:\\geckodriver.exe");
                          WebDriver driver = new FirefoxDriver();
                          driver.get("https://www.priceline.com/");
                          driver.manage().window().maximize();

                          WebElement element = driver.findElement(By.linkText("Hotels"));

                          // waits until Home link is visible on the web page

                          WebDriverWait wait = new WebDriverWait(driver, 20);
                          wait.until(ExpectedConditions.visibilityOf(element));

                         element.click();

                         // waits until About link is visible
  wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Cruises")));

                         driver.quit();
            }
}


