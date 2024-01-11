package testNg;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionExample {
	WebDriver driver;
  @Test
  public void check_whether_obsquarazone_website_is_displayed() {
	  //verification using title
	  String actualResult = driver.getCurrentUrl();
	  //System.out.println(actualResult);
	  String expectedResult = "https://selenium.obsqurazone.com/index.php";
	  Assert.assertEquals(actualResult, expectedResult);//hard assertion
	  
  }
  @Test
  public void verify_the_logo_is_displayed()
  {
	  WebElement logo = driver.findElement(By.xpath("(//img[@src='images/logo.png'])[1]"));
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	  wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//img[@src='images/logo.png'])[1]")));
	  Boolean result = logo.isDisplayed();
	  SoftAssert softAssert = new SoftAssert();
	  softAssert.assertTrue(result);
	  softAssert.assertAll();
  }
  @Test
  public void verifyTheInputFormPageIsOpenWhileClickOnInputFormTab()
  {
	  WebElement inputForm = driver.findElement(By.xpath("(//a[@class='nav-link'])[2]"));
	  //Explicitly wait
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	  wait.until(ExpectedConditions.elementToBeClickable(inputForm));
	  inputForm.click();
	  WebElement singleInputField = driver.findElement(By.xpath("(//div[@class='card-header'])[2]"));
	  wait.until(ExpectedConditions.visibilityOf(singleInputField));
	  String actualResult = singleInputField.getText();
	  String expectedResult = "Single Input Field";
	  Assert.assertEquals(actualResult, expectedResult);
  }
  @Test
  public void verifyDatePickersPageIsOpenWhileClickOnDatePickersTab()
  {
	  WebElement datePicker = driver.findElement(By.xpath("(//a[contains( 'Date Pickers','a')])[5]"));
	  
	  //For fluent wait
		  Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		  .withTimeout(Duration.ofSeconds(10)) 
		  .pollingEvery(Duration.ofSeconds(5))
		  .ignoring(NoSuchElementException.class);//only throw exception after completing the 10 second
		  wait.until(ExpectedConditions.elementToBeClickable(datePicker));
		 
	  datePicker.click();
	  WebElement datePickerText = driver.findElement(By.xpath("(//div[@class='card-header'])[2]"));
	  String actualResult = datePickerText.getText();
	  String expectedResult = "Date Picker";
	  Assert.assertEquals(actualResult, expectedResult);
  }
  @BeforeClass
  public void beforeClass() {
		driver = new ChromeDriver(); 
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
