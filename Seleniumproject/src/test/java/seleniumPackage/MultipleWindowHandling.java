package seleniumPackage;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//To get parent window handle
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("This is parent window :"+parentWindowHandle);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement frame1 = driver.findElement(By.id("a077aa5e"));
		js.executeScript("arguments[0].scrollIntoView();", frame1);
		driver.switchTo().frame(frame1);
		
		WebElement frameimage = driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		frameimage.click();
		
		Set<String> allWindowHandling = driver.getWindowHandles();//get all open window handles in execusion
		for (String handle : allWindowHandling) {
			System.out.println(handle);
			
			if(!handle.equalsIgnoreCase(parentWindowHandle))
			{
				driver.switchTo().window(handle);
				
				System.out.println("Current url of child "+driver.getCurrentUrl());
				System.out.println("Current page title "+driver.getTitle());
				
			}
		}
		driver.switchTo().window(parentWindowHandle);
		System.out.println("Current page title "+driver.getCurrentUrl());
		
		driver.switchTo().defaultContent();
		WebElement email = driver.findElement(By.id("philadelphia-field-email"));
		email.sendKeys("nisha@gmail.com");
		
		Thread.sleep(5000);
		//driver.quit();
	}

}
