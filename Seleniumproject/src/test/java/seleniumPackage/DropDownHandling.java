package seleniumPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/select-input.php");
		driver.manage().window().maximize();
		
		WebElement singleInputField = driver.findElement(By.id("single-input-field"));
		Select select = new Select(singleInputField);
		select.selectByIndex(2);
		select.selectByVisibleText("Yellow");
		select.selectByValue("Green");
		
		Boolean multiselect = select.isMultiple();
		System.out.println(multiselect);
		
		WebElement multiSelectField = driver.findElement(By.id("multi-select-field"));
		Select select1 = new Select(multiSelectField);
		Boolean multiselect1 = select1.isMultiple();
		System.out.println(multiselect1);
		select1.selectByIndex(2);
		select1.selectByVisibleText("Yellow");
		select1.selectByValue("Green");
		
		WebElement firstselectedvalue = select1.getFirstSelectedOption();
		System.out.println("getFirstSelectedOption() : "+firstselectedvalue.getText());
		
		List<WebElement> list1 = select1.getAllSelectedOptions();
		for(WebElement element1 : list1)
		{
			System.out.println("getAllSelectedOptions():"+element1.getText());
		}
		
		List<WebElement> list2 = select1.getOptions();
		for(WebElement element2 : list2)
		{
			System.out.println("getOptions() : "+element2.getText());
		}
		
		
		//select.deselectAll();
		select1.deselectByIndex(1);
		select1.deselectByValue("Red");

	}

}
