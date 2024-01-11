package seleniumAssignment;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAssignment11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Locate table button
		WebElement tableButton = driver.findElement(By.xpath("//a[@href='table-pagination.php']"));
		tableButton.click();
		
		//Print the all details of the person "Tiger Nixon" in the console
		WebElement tablecontent = driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr[1]"));
		System.out.println(tablecontent.getText());
		
		//Click on “Table sort and search”
		WebElement sortSearch = driver.findElement(By.linkText("Table Sort And Search"));
		sortSearch.click();
		
		//Search name as "Dai Rios" in the search box
		WebElement searchBox = driver.findElement(By.xpath("//input[@type='search']"));
		searchBox.sendKeys("Dai Rios");
		
		//Then very the searched name is display or not
		System.out.println(searchBox.isDisplayed());
		
		//Click on "HOME" tab and verify the logo is displayed or not
		WebElement home = driver.findElement(By.xpath("//a[text()='Home']"));
		home.click();
		
		//Close the browser window
		driver.close();

	}

}
