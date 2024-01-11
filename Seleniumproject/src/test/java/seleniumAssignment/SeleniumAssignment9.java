package seleniumAssignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAssignment9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String parentWindowHandle = driver.getWindowHandle();
		System.out.println("This is parent window :"+parentWindowHandle);
		
		//click on Open New Window. Maximize the window
		WebElement newWindow = driver.findElement(By.id("newWindowBtn"));
		newWindow.click();
		
		Set<String> allWindowHandling = driver.getWindowHandles();//get all open window handles in execusion
		for (String handle : allWindowHandling) {
			System.out.println(handle);
			
			if(!handle.equalsIgnoreCase(parentWindowHandle))
			{
				driver.switchTo().window(handle);
				
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				//all performance are done in new window in this area
				//Print URL and title of that window
				System.out.println("Current url of child "+driver.getCurrentUrl());
				System.out.println("Current page title "+driver.getTitle());
		
				//FILL ALL FIELDS AND CLICK ON REGISTER BUTTON
				JavascriptExecutor js = (JavascriptExecutor)driver;
				WebElement firstName = driver.findElement(By.id("firstName"));
				js.executeScript("arguments[0].scrollIntoView();", firstName);
				firstName.sendKeys("Nisha");
				
				WebElement lastName = driver.findElement(By.id("lastName"));
				js.executeScript("arguments[0].scrollIntoView();", lastName);
				lastName.sendKeys("P");
				
				WebElement genderfemale = driver.findElement(By.id("femalerb"));
				js.executeScript("arguments[0].scrollIntoView();", genderfemale);
				genderfemale.click();
				
				WebElement english = driver.findElement(By.id("englishchbx"));
				js.executeScript("arguments[0].scrollIntoView();", english);
				english.click();
				
				WebElement email = driver.findElement(By.id("email"));
				js.executeScript("arguments[0].scrollIntoView();", email);
				email.sendKeys("nisha@gmail.com");
				
				WebElement password = driver.findElement(By.id("password"));
				js.executeScript("arguments[0].scrollIntoView();", password);
				password.sendKeys("1234567890");
				
				//Perform successful registration
				WebElement btnregister = driver.findElement(By.id("registerbtn"));
				js.executeScript("arguments[0].scrollIntoView();", btnregister);
				btnregister.click();
				
				//Then verify the "Registration is Successful" text is displayed or not by using getText()
				WebElement textMessage = driver.findElement(By.id("msg"));
				System.out.println("Registration is Successful : "+textMessage.isDisplayed());
				
				//Minimize the window and then switch back to the main window
				driver.manage().window().minimize();
				
				//Close all browser windows.
				driver.quit();
								
			}		}
			}

}
