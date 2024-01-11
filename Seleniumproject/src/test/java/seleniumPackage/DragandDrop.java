package seleniumPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriver driver = new ChromeDriver();
		   driver.get("http://demo.guru99.com/test/drag_drop.html");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			
			
			WebElement drag5000 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
			
			Actions actions = new Actions(driver);
			WebElement dropAmount = driver.findElement(By.id("amt7"));
			actions.dragAndDrop(drag5000, dropAmount).build().perform();

	}

}
