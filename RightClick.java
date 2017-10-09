package Practice;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
	 
	public class RightClick {
	 
	 
	    @Test
	    public void method1() {
	 
	        WebDriver driver = new FirefoxDriver();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        driver.get("http://automate-apps.com/");
	        System.out.println(driver.getTitle());
	        Actions action = new Actions(driver);
	        WebElement element = driver.findElement(By.partialLinkText("SELENIUM QUESTIONS"));
	        action.contextClick(element).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	        Set<String> winid = driver.getWindowHandles();
	        Iterator<String> iter = winid.iterator();
	        iter.next();
	        String tab = iter.next();
	        driver.switchTo().window(tab);
	        System.out.println(driver.getTitle());
	        driver.quit();
	    }
	 
	}


