package Practice;
import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdown {
	 
	    WebDriver driver;
	 
	    @Test
	    public void testApp() {
	                System.getProperty("webdriver.Chrome.Driver", "c:\\ChromeDriver.exe");
	        driver = new ChromeDriver();
	        driver.get("http://automate-apps.com/select-multiple-options-from-a-drop-down-list/");
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        WebElement selectList = driver.findElement(By.xpath("//select[@name='cars']"));
	        Select select = new Select(selectList);
	        select.selectByVisibleText("Maruti");
	        select.selectByVisibleText("Honda");
	 
	    }
	 
	}


