package seleniumAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAssignment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get(" https://demoqa.com/frames");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement frame1 = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frame1);
		
		WebElement sampleHeading = driver.findElement(By.id("sampleHeading"));
		System.out.println(sampleHeading.getText());
		driver.switchTo().defaultContent();
		
		WebElement forms1 = driver.findElement(By.xpath("(//div[@class='header-wrapper'])[2]"));
		forms1.click();

	}

}
