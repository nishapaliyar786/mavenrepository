package seleniumAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAssignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
		driver.manage().window().maximize();
		
//		WebElement buttonTwo = driver.findElement(By.id("button-two"));
//		buttonTwo.click();
//		
//		WebElement checkbox1 = driver.findElement(By.xpath("//input[@class='check-box-list'][1]"));
//		Boolean resultcheckBox1 = checkbox1.isSelected();
//		System.out.println(resultcheckBox1);
//		
//		WebElement checkbox2 = driver.findElement(By.xpath("(//input[@class='check-box-list'])[2]"));
//		Boolean resultcheckBox2 = checkbox2.isSelected();
//		System.out.println(resultcheckBox2);
//		
//		WebElement checkbox3 = driver.findElement(By.xpath("(//input[@class='check-box-list'])[3]"));
//		Boolean resultcheckBox3 = checkbox3.isSelected();
//		System.out.println(resultcheckBox3);
//		
//		WebElement checkbox4 = driver.findElement(By.xpath("(//input[@class='check-box-list'])[4]"));
//		Boolean resultcheckBox4 = checkbox4.isSelected();
//		System.out.println(resultcheckBox4);
		
		List<WebElement> allCheckboxes = driver.findElements(By.className("check-box-list"));//list value stored in WebElement
		for(WebElement element:allCheckboxes)//each iteration have elemnt from a list so use foreach loop
		{
			element.click();
			Boolean checkBoxResult = element.isSelected();
			System.out.println(checkBoxResult);
		}
		//driver.quit();

	}

}
