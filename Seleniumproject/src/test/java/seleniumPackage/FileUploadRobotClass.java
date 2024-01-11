package seleniumPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadRobotClass {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://resume.naukri.com/resume-quality-score");
		driver.manage().window().maximize();
		
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

}
