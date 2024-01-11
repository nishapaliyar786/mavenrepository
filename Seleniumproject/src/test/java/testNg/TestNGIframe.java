package testNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class TestNGIframe {
	WebDriver driver;
  @Test
  public void check_wheteher_user_can_switch_different_frames() {
	  WebElement frame1 = driver.findElement(By.name("packageListFrame"));//locate frame
		driver.switchTo().frame(frame1); //switch to frame
		//locate webelement in frame
		WebElement f1a = driver.findElement(By.xpath("//a[@href='org/openqa/selenium/package-frame.html']"));
		f1a.click();
		
		driver.switchTo().defaultContent();//return from the frame
		
		//switch to second frame using index
		//driver.switchTo().frame(1);
		
		//switch to second frame using name
		driver.switchTo().frame("packageFrame");
		WebElement f2a = driver.findElement(By.xpath("//a[@href='package-summary.html'][1]"));
		System.out.println(f2a.isDisplayed());
		System.out.println(f2a.getText());
		driver.switchTo().parentFrame();//return from the frame
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
