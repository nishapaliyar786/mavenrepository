package testNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class DataProviderTestClass {
	WebDriver driver;
  @Test(dataProviderClass = DataProviderClass1.class,dataProvider = "dp")
  public void verifyUnsuccessfulLogin(String uname,String password1) {
	  WebElement userName = driver.findElement(By.name("username"));
	  userName.sendKeys(uname);
	  WebElement password = driver.findElement(By.name("password"));
	  password.sendKeys(password1);
	  WebElement submit = driver.findElement(By.name("submit"));
	  submit.click();
	  String actualResult = driver.getCurrentUrl();
	  String expectedResult = "https://qalegend.com/restaurant/login";

	  Assert.assertEquals(actualResult, expectedResult);
}
  @Test(dataProviderClass = DataProviderClass1.class,dataProvider = "login")
  public void verifySuccessfulLogin(String uname,String password1) {
	  WebElement userName = driver.findElement(By.name("username"));
	  userName.sendKeys(uname);
	  WebElement password = driver.findElement(By.name("password"));
	  password.sendKeys(password1);
	  WebElement submit = driver.findElement(By.name("submit"));
	  submit.click();
	  WebElement toggleCollapsed = driver.findElement(By.xpath("(//button[@type='button'])[1]"));
	  Boolean result = toggleCollapsed.isDisplayed();
	  Assert.assertTrue(result);
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver = new ChromeDriver();
		driver.get("https://qalegend.com/restaurant/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
	  
  }

}
