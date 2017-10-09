package Practice;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Implicitwait {

   public static void main(String s[]) {
	   System.getProperty("webdriver.Chrome.Driver", "c:\\ChromeDriver.exe");
              WebDriver driver = new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(30, TimeUnit.MINUTES);

       driver.get("http://google.com");

       driver.findElement(By.name("q")).sendKeys("Selenium");

       driver.findElement(By.xpath("//div[@class='sbsb_a']//ul/li[4]")).click();

       driver.close();
   }

}
