package seleniumPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   WebDriver driver = new ChromeDriver();
   driver.get("https://selenium.obsqurazone.com/javascript-alert.php");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	WebElement clickme1 = driver.findElement(By.xpath("(//button[text()='Click me!'])[1]"));
	clickme1.click();
	
	//SIMPLE ALERT
	//switch to alert
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().accept();//accept alert or click
	
	WebElement clickme2 = driver.findElement(By.xpath("(//button[text()='Click me!'])[2]"));
	clickme2.click();
	
	//CONFIRMATION ALERT
	//switch to alert
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().dismiss();//dismiss alert
	
	WebElement clickme3 = driver.findElement(By.xpath("//button[text()='Click for Prompt Box']"));
	clickme3.click();
	
	//PROMPT ALERT
	//switch to alert
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().sendKeys("Nisha");//send text to alert box
	driver.switchTo().alert().dismiss();//dismiss alert . Also you can accept alert 
	
	}

}
