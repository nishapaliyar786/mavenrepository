package seleniumPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandling1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/write-xpath-table.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement table1 = driver.findElement(By.xpath("//table[@border='l']"));
		System.out.println(table1.getText());
		String text = table1.getText();
		if(text.contains("second cell"))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		

	}

}



