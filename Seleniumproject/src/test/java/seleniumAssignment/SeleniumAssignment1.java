package seleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
	       driver.get("https://selenium.obsqurazone.com/index.php");
	       driver.manage().window().maximize();
	       driver.navigate().to("https://selenium.obsqurazone.com/simple-form-demo.php");
	       
	       WebElement textsingleInputField = driver.findElement(By.id("single-input-field"));
	       textsingleInputField.sendKeys("Hello");
	       
	       WebElement button1 = driver.findElement(By.id("button-one"));
	       button1.click();
	       
	       WebElement message1 = driver.findElement(By.id("message-one"));
	       String s = message1.getText();
	       System.out.println(s);
	       
	       WebElement valuea = driver.findElement(By.id("value-a"));
	       valuea.sendKeys("10");
	       WebElement valueb = driver.findElement(By.id("value-b"));
	       valueb.sendKeys("30");
	       
	       WebElement button2 = driver.findElement(By.id("button-two"));
	       button2.click();
	       
	       WebElement message2 = driver.findElement(By.id("message-two"));
	       String s1 = message2.getText();
	       System.out.println(s1);
	       
	       //driver.quit();
	       
	}

}
