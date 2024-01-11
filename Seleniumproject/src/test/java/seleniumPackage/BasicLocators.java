package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       WebDriver driver = new ChromeDriver();
       driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
       driver.manage().window().maximize();
       
       //WebElement messageInputBox = driver.findElement(By.id("single-input-field"));//using locator id
       //WebElement messageInputBox = driver.findElement(By.cssSelector("#single-input-field"));//using locator css selector
       WebElement messageInputBox = driver.findElement(By.className("form-control"));//using locator class
       messageInputBox.sendKeys("hai");//show text in textbox in website
       
       WebElement showMessageButton1 = driver.findElement(By.linkText("Show Message"));//using locator linkText
       showMessageButton1.click();

//       WebElement showMessageButton2 = driver.findElement(By.partialLinkText("Message"));//using locator linkText
//       showMessageButton2.click();
       
       WebElement enterValueInputBox = driver.findElement(By.className("form-control"));//using locator class
       enterValueInputBox.sendKeys("10");//show text in textbox in website
       
       
       
       driver.quit();
	}

}
