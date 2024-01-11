package seleniumPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableHandling {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");

		boolean result = getValueFromTable("Mexico");
	}

	public static boolean getValueFromTable(String name) {
		int rowCount = driver.findElements(By.xpath("//table[@id='customers']//tr")).size();//get no. of rows
		int columnCount = driver.findElements(By.xpath("//table[@id='customers']//th")).size();//get no. of columns
        System.out.println("Row count is :" + rowCount + "Column count is : " + columnCount);

		boolean flag = false; //used to check visibility of searched value in table
		for (int row = 1; row < rowCount; row++) {
			for (int column = 1; column <= columnCount; column++) {
				String actValue = driver
						.findElement(
								By.xpath("//table[@id='customers']//tbody//tr[" + (row + 1) + "]//td[" + column + "]"))
						.getText();

				if (actValue.equalsIgnoreCase(name)) {
					System.out.println( "row : "+row +" column : " + column);//print the row and column of searched name
					break;
				}
			}
		}
		if (flag) { //if the name exists it will return true
			return true;
		}
		return flag;
	}

}
