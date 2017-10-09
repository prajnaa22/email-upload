package Practice;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Screenshot {
	
	 WebDriver driver;
	  String baseUrl;
	  
	  @BeforeTest
	  public void start() {
		  System.setProperty("webdriver.gecko.driver", "c:\\geckodriver.exe");
	    driver = new FirefoxDriver();
	    baseUrl = "http://www.gmail.com";
	    System.out.println("Launch Application");
	    driver.get(baseUrl);
	  }
	  
	  @Test
	  public void testApp() throws InterruptedException, IOException {
	     File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	     FileUtils.copyFile(scrFile, new File("c:\\gmailHomePage.jpg")); 
	     Thread.sleep(2000);
	  }
	  
	  @AfterTest
	  public void close() {
	    //closes browser
	    driver.quit();
	  }
	}


