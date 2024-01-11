package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadSendKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriver driver = new ChromeDriver();
     driver.get("https://the-internet.herokuapp.com/upload");
     driver.manage().window().maximize();
     
     WebElement fileUpload = driver.findElement(By.id("file-upload"));
     fileUpload.sendKeys("D:\\Obsquara\\Automation_Ansala\\Screenshot_Assignment1.docx");
     
     WebElement fileSubmit = driver.findElement(By.id("file-submit"));
     fileSubmit.click();
	}

}
