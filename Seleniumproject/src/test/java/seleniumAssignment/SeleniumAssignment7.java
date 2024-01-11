package seleniumAssignment;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumAssignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://qalegend.com/restaurant/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement uname = driver.findElement(By.name("username"));
		uname.sendKeys("admin");
		WebElement pwd = driver.findElement(By.name("password"));
		pwd.sendKeys("password");
		WebElement submit = driver.findElement(By.name("submit"));
		submit.click();
		
		WebElement field = driver.findElement(By.xpath("(//button[@type='button'])[1]"));
		field.click();
		
		WebElement product = driver.findElement(By.xpath("(//*[@class='menu-text'])[2]"));
		product.click();	
		
		WebElement addProduct = driver.findElement(By.xpath("//button[text()='Add Product']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", addProduct);
		js.executeScript("arguments[0].click();", addProduct);
		
		WebElement type = driver.findElement(By.id("Type"));
		Select select = new Select(type);
		select.selectByIndex(2);
		
		//Locate code textview and pass value
		WebElement code = driver.findElement(By.id("ProductCode"));
		code.sendKeys("1234");
		
		//Locate name and pass name
		WebElement name = driver.findElement(By.id("ProductName"));
		name.sendKeys("Carrot11");
		
		//Select catagory from dropdownlist
		WebElement category = driver.findElement(By.id("Category"));
		Select select1 = new Select(category);
		select1.selectByVisibleText("vegetables");
		
		//Locate tax
		WebElement tax = driver.findElement(By.id("Tax"));
		tax.sendKeys("10%");
		
		//Locate price
		WebElement price = driver.findElement(By.id("Price"));
		price.sendKeys("300");
		
		//Locate file upload
		WebElement file1 = driver.findElement(By.id("ImageInput"));
		file1.sendKeys("D:\\Obsquara\\Automation_Ansala\\Screenshot_Assignment1.docx");
		
		//Locate submit button
		WebElement submit1 = driver.findElement(By.xpath("(//button[@class='btn btn-add'])[1]"));
		js.executeScript("arguments[0].scrollIntoView();", submit1);
		submit1.click();
		
		//Locate Add product
		WebElement addproduct1 = driver.findElement(By.id("add_item"));
		addproduct1.sendKeys("Carrot11");
		
		//locate another submit button
		WebElement submit2 = driver.findElement(By.xpath("//button[@class='btn btn-add hiddenpr']"));
		submit2.click();
		
		WebElement search = driver.findElement(By.xpath("(//input[@class='form-control input-sm'])[1]"));
		search.sendKeys("carrot");		
		
	}
}
