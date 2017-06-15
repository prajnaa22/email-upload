package Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmailUpload {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\-\\Downloads\\chromedriver.exe");
 		WebDriver driver = new ChromeDriver(); 
 		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
 		driver.manage().window().maximize();
 		
 Thread.sleep(5000);
 
 		driver.findElement(By.id("identifierId")).sendKeys("prajnaa22@gmail.com");
 		
 		driver.findElement(By.id("identifierNext")).click();
 		
 		driver.findElement(By.name("password")).sendKeys("Pragnya@522");
 		Thread.sleep(5000);
 		driver.findElement(By.id("passwordNext")).click();
 
 		
 		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
 
 
 		driver.findElement(By.xpath("//*[contains(text(),'COMPOSE')]")).click();
 
 		driver.findElement(By.xpath("//div[@class='a1 aaA aMZ']")).click();
 		//*[contains(text(),'COMPOSE')
 		
 		StringSelection ss=new StringSelection("C:\\Users\\Desktop\\testing classes");
 		
 
 		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
 		Robot robot = new Robot();
 		/*robot.keyPress(KeyEvent.VK_ENTER);
 		robot.keyRelease(KeyEvent.VK_ENTER);*/
 		robot.keyPress(KeyEvent.VK_CONTROL);
 		robot.keyPress(KeyEvent.VK_V);
 		Thread.sleep(5000);
 		robot.keyRelease(KeyEvent.VK_CONTROL);
 		robot.keyRelease(KeyEvent.VK_V);
 		robot.keyPress(KeyEvent.VK_ENTER);
 		robot.keyRelease(KeyEvent.VK_ENTER);

	}

}
