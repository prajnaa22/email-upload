package Practice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Drivermethods {
	
	 public static WebDriver driver;
	  public static String baseUrl;
	   
	  public static void main(String s[]) //throws InterruptedException 
	  {
	       //Initialize driver instance
		  System.setProperty("webdriver.gecko.driver", "c:\\geckodriver.exe");
	     WebDriver  driver = new FirefoxDriver();
	       baseUrl = "http://www.gmail.com";
	       //Thread.sleep(5000);
	         
	       //Launch Application on browser 
	       driver.get(baseUrl);
	       
	       //Fetch page title and store it in a variable 
	       String pageTitle = driver.getTitle();
	       //Print title
	       System.out.println(pageTitle);
	       
	       //Get current url and store it in a variable 
	       String currentUrl = driver.getCurrentUrl();
	       //Print current URL
	       System.out.println(currentUrl);
	       
	      //Get page source and store it in a variable  
	      String pageSource = driver.getPageSource(); 
	      //Print Page Source
	      System.out.println(pageSource);
	       
	      //close browser
	      driver.close();       
	  }
	  
	}


