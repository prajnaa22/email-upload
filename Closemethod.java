package Practice;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Closemethod {
	
	 
		     public static void main(String s[]) throws InterruptedException {
	          //Initialize driver instance
		    	 System.setProperty("webdriver.gecko.driver", "c:\\geckodriver.exe");
	         WebDriver driver=new FirefoxDriver();
	         driver.manage().timeouts().implicitlyWait(30, TimeUnit.MINUTES);
	 
	         //Launch Google page
	         driver.get("http://www.google.com/");
	         
	         //Search for 'Sign In' link and store it in a variable
	         WebElement signInElement = driver.findElement(By.linkText("Sign in"));
	          
	         //Perform Right click on 'sign In' link and open page in a new window
	         Actions action = new Actions(driver);
	         action.moveToElement(signInElement);
	         action.contextClick(signInElement).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	          
	         Thread.sleep(3000);
	         driver.quit();
	 
	     }
	}


