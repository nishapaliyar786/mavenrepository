package seleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAssignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://groceryapp.uniqassosiates.com/sign-up");
		driver.manage().window().maximize();
		
		WebElement firstName = driver.findElement(By.xpath("(//input[@id='ap_email'])[1]"));
		firstName.sendKeys("Nisha");
		

		WebElement lastName = driver.findElement(By.xpath("(//input[@id='ap_email'])[2]"));
		lastName.sendKeys("P Aliyar");
		

		WebElement email = driver.findElement(By.xpath("(//input[@id='ap_email'])[3]"));
		email.sendKeys("nishapaliyar786@gmail.com");
		

		WebElement telephone = driver.findElement(By.xpath("(//input[@id='ap_email'])[4]"));
		telephone.sendKeys("8848665518");
		

		WebElement password = driver.findElement(By.id("password1"));
		password.sendKeys("abcd567890");
		

		WebElement repeatpassword = driver.findElement(By.id("password2"));
		repeatpassword.sendKeys("abcd567890");
		
		WebElement signUp = driver.findElement(By.className("next_ch02"));
		signUp.click();
		

	}

}
