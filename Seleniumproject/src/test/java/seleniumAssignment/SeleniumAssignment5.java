package seleniumAssignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAssignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement logo = driver.findElement(By.xpath("(//img[@src='images/logo.png'])[1]"));
		Boolean displayCheck = logo.isDisplayed();
		System.out.println("logo is dispalyed : "+displayCheck);
		
		Dimension sizelogo= logo.getSize();
		System.out.println("Size of the logo is : "+sizelogo);
		
		System.out.println("location of the logo is : "+logo.getLocation());
		
		WebElement copyRight = driver.findElement(By.xpath("//p[text()='© 2021 Obsqura Testing, All Rights Reserved.']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", copyRight);
		System.out.println("Text of the copyright is : "+copyRight.getText()); 
		System.out.println("Font family is : "+copyRight.getCssValue("font-family")) ;
		System.out.println("Font size is : "+copyRight.getCssValue("font-size"));
		System.out.println("Tagname is : "+copyRight.getTagName());
		
		

	}

}
