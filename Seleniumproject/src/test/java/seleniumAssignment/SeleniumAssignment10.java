package seleniumAssignment;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAssignment10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("This is parent window :"+parentWindowHandle);
		
		//click on Open New Tab
		WebElement newTab = driver.findElement(By.id("newTabBtn"));
		newTab.click();
		Set<String> allWindowHandling = driver.getWindowHandles();//get all open window handles in execusion
		for (String handle : allWindowHandling) {
			System.out.println(handle);
			
			if(!handle.equalsIgnoreCase(parentWindowHandle))
			{
				driver.switchTo().window(handle);
				
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				//all performance are done in new window in this area
				//print the title and URL of that window
				System.out.println("Current url of child "+driver.getCurrentUrl());
				System.out.println("Current page title "+driver.getTitle());
				
				//Click on the 1st Click me button under "Click the below button to display an alert box". 
				WebElement button1 = driver.findElement(By.id("alertBox"));
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("arguments[0].scrollIntoView();", button1);
				button1.click();
				
				//SIMPLE ALERT
				//switch to alert
				//print the text in the alert in to console then handle the alert
				System.out.println(driver.switchTo().alert().getText());
				driver.switchTo().alert().accept();//accept alert or click
				
				//switch back to the main window and close all browser windows.
				driver.switchTo().window(parentWindowHandle);
				driver.quit();
			}
		}

	}

}
