package testNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.sql.Driver;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class FirstTestNGScript {
	WebDriver driver ;
  @Test(priority = 0)//first run this testcase if i cannot give priority then run based on alphanumerical order
  public void verify_select_option_from_the_dropdown() {//function name must same as testcase
	  WebElement singleInputField = driver.findElement(By.id("single-input-field"));
		Select select = new Select(singleInputField);
		select.selectByIndex(2);
		System.out.println("verify_select_option_from_the_dropdown");
  }
  @Test(priority = 1)//second run this testcase
  public void verifyToSelectanMultipleDropDown()
  {
	  WebElement singleInputField = driver.findElement(By.id("single-input-field"));
	  Select select = new Select(singleInputField);
	  Boolean multiselect = select.isMultiple();
	  System.out.println(multiselect);
	  System.out.println("verifyToSelectanMultipleDropDown");

  }
  @Test(priority = 2)
  public void verify_second_dropdown_is_multiselect_or_not()
  {
	  WebElement multiSelectField = driver.findElement(By.id("multi-select-field"));
		Select select1 = new Select(multiSelectField);
		Boolean multiselect1 = select1.isMultiple();
		System.out.println(multiselect1);
  }
  
  @Test(priority = 3)
  public void verify_first_selected_option_from_the_dropdownlist()
  {
	  WebElement multiSelectField = driver.findElement(By.id("multi-select-field"));
		Select select1 = new Select(multiSelectField);
		select1.selectByIndex(2);
		select1.selectByVisibleText("Yellow");
		select1.selectByValue("Green");
		WebElement firstselectedvalue = select1.getFirstSelectedOption();
		System.out.println("getFirstSelectedOption() : "+firstselectedvalue.getText());
  }
  @Test(priority = 4)
  public void verify_all_selected_option_from_the_dp()
  {
	  WebElement multiSelectField = driver.findElement(By.id("multi-select-field"));
		Select select1 = new Select(multiSelectField);
		select1.selectByIndex(2);
		select1.selectByVisibleText("Yellow");
		select1.selectByValue("Green");
		List<WebElement> list1 = select1.getAllSelectedOptions();
		for(WebElement element1 : list1)
		{
			System.out.println("getAllSelectedOptions():"+element1.getText());
		}
  }
  @Test(priority = 5)
  public void verify_all_options_from_the_dp()
  {
	  WebElement multiSelectField = driver.findElement(By.id("multi-select-field"));
		Select select1 = new Select(multiSelectField);
		select1.selectByIndex(2);
		select1.selectByVisibleText("Yellow");
		select1.selectByValue("Green");
		List<WebElement> list2 = select1.getOptions();
		for(WebElement element2 : list2)
		{
			System.out.println("getOptions() : "+element2.getText());
		}
  }
  @Test(priority = 6)
  public void verify_deselectall_selected_options_from_the_dropdown()
  {
	  WebElement multiSelectField = driver.findElement(By.id("multi-select-field"));
		Select select1 = new Select(multiSelectField);
		select1.selectByIndex(2);
		select1.selectByVisibleText("Yellow");
		select1.selectByValue("Green");
		select1.deselectAll();
  }
  @BeforeMethod 
  public void beforeMethod() {
	  
		driver = new ChromeDriver(); 
		driver.get("https://selenium.obsqurazone.com/select-input.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
	  
  }

}
