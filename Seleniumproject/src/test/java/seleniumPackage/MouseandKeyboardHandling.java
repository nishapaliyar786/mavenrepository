package seleniumPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseandKeyboardHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 WebDriver driver = new ChromeDriver();
		   driver.get("https://selenium.obsqurazone.com/index.php");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			Actions actions = new Actions(driver);
			
			WebElement inputForm = driver.findElement(By.xpath("(//a[@class='nav-link'])[2]"));
			actions.moveToElement(inputForm).click().build().perform();//move using mouse and click element
			//actions.click(inputForm).build().perform();//only click the element
			
			//code for double click using mouse
			//actions.doubleClick(inputForm).build().perform();
			
			//For right click
			//actions.contextClick(inputForm).build().perform();
			
			WebElement  messageInput = driver.findElement(By.id("single-input-field"));
			actions.click(messageInput).build().perform();
			actions.keyDown(Keys.SHIFT).sendKeys("h").keyUp(Keys.SHIFT).sendKeys("ello").build().perform();//Press shift key and press h and release shift key for print capital h
		
			WebElement showMessage = driver.findElement(By.id("button-one"));
			actions.sendKeys(showMessage,Keys.ENTER).click().build().perform();
			
			Thread.sleep(3000);
			driver.quit();
			

	}

}
