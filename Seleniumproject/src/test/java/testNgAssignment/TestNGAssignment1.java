package testNgAssignment;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TestNGAssignment1 {
	WebDriver driver;
  @Test
  public void verifySuccessfulLogin() {
	  WebElement userName = driver.findElement(By.name("username"));
	  userName.sendKeys("admin");
	  WebElement password = driver.findElement(By.name("password"));
	  password.sendKeys("password");
	  WebElement submit = driver.findElement(By.name("submit"));
	  submit.click();
	  WebElement toggleCollapsed = driver.findElement(By.xpath("(//button[@type='button'])[1]"));
	  Boolean result = toggleCollapsed.isDisplayed();
	  Assert.assertTrue(result);
	  
	  
  }
  @Test
  public void verifyUnsuccessfulLogin() {
	  WebElement userName = driver.findElement(By.name("username"));
	  userName.sendKeys("admi");
	  WebElement password = driver.findElement(By.name("password"));
	  password.sendKeys("passwor");
	  WebElement submit = driver.findElement(By.name("submit"));
	  submit.click();
	  WebElement login = driver.findElement(By.xpath("//img[@src='https://qalegend.com/restaurant/files/Setting/cdd1e6a449ebe565eaba423bd9c99b8a.png']"));
	  Boolean result = login.isDisplayed();
	  Assert.assertTrue(result);
}
  @Test
  public void verifyTheLogoIsDisplayedOrNot()
  {
	  WebElement logo = driver.findElement
			  (By.xpath("//img[@src='https://qalegend.com/restaurant/files/Setting/cdd1e6a449ebe565eaba423bd9c99b8a.png']"));
	  Boolean result = logo.isDisplayed();
	  SoftAssert softAssert = new SoftAssert();
	  softAssert.assertTrue(result);
	  softAssert.assertAll();
	  
  }
  @Test
  public void verifyAllStoresAreDisplayedInHomePageOrNot()
  {
	  WebElement userName = driver.findElement(By.name("username"));
	  userName.sendKeys("admin");
	  WebElement password = driver.findElement(By.name("password"));
	  password.sendKeys("password");
	  WebElement submit = driver.findElement(By.name("submit"));
	  submit.click();
	  List<WebElement> stores = driver.findElements(By.xpath("//*[@class='store_title']"));
	  for(WebElement element : stores)
	  {
		  element.isDisplayed();
		  System.out.println(element);
	  }
	  String actualResultOne=driver.getTitle();
	  String expectedResult="POS - point of sale Al Razi Kuzhimandhi";
	 Assert.assertEquals(actualResultOne,expectedResult);
	 System.out.println("stores found");
	  
  }
  @Test
  //ClickOnProductTab
  public void verifyToSearchAProductMangoJamIsDisplayedOrNot()
  {
	  WebElement userName = driver.findElement(By.name("username"));
	  userName.sendKeys("admin");
	  WebElement password = driver.findElement(By.name("password"));
	  password.sendKeys("password");
	  WebElement submit = driver.findElement(By.name("submit"));
	  submit.click();
	  WebElement toggleCollapsed = driver.findElement(By.xpath("(//button[@type='button'])[1]"));
	  toggleCollapsed.click();
	  WebElement product = driver.findElement(By.xpath("(//span[@class='menu-text'])[2]"));
	  product.click();
	  WebElement search = driver.findElement(By.xpath("//input[@class='form-control input-sm']"));
	  search.sendKeys("Mango jam");
	  String expectedResult = "Mango jam";
	  String actualResult = search.getText();
	  Assert.assertEquals(actualResult, expectedResult);
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
