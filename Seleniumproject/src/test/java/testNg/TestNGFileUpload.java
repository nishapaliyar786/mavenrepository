package testNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class TestNGFileUpload {
	WebDriver driver ;
  @Test(priority = 1)
  public void check_whether_file_upload_successfully1() {
	  WebElement fileUpload = driver.findElement(By.id("file-upload"));
	     fileUpload.sendKeys("D:\\Obsquara\\Automation_Ansala\\Screenshot_Assignment1.docx");
	     
	     WebElement fileSubmit = driver.findElement(By.id("file-submit"));
	     fileSubmit.click();
  }
  @Test(priority = 0)
  public void check_whether_file_upload_successfully2() throws AWTException
  {
	  driver.navigate().to("https://resume.naukri.com/resume-quality-score");
	  WebElement fileUpload = driver.findElement(By.className("browse"));
		fileUpload.click();
		
		
      Robot robot = new Robot();
      StringSelection filePath = new StringSelection("D:\\Obsquara\\Automation_Ansala\\Screenshot_Assignment1.docx");
      
      Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);
      robot.keyPress(KeyEvent.VK_CONTROL);//press control key
      robot.delay(2);
      robot.keyPress(KeyEvent.VK_V);//press V key
      
      robot.keyRelease(KeyEvent.VK_CONTROL);//release control key
      robot.delay(2);
      robot.keyRelease(KeyEvent.VK_V);//release V key
      
      robot.keyPress(KeyEvent.VK_ENTER);//press enter key
      robot.delay(2);
      robot.keyRelease(KeyEvent.VK_ENTER);//release enter key
      
      System.out.println("file upload successfully");
  }
  @BeforeMethod
  public void beforeMethod() {
	     driver = new ChromeDriver();
	     driver.get("https://the-internet.herokuapp.com/upload");
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
