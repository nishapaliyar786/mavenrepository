package seleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumListProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.com.driver", "path");
		WebDriver driver = new ChromeDriver(); //webdriver is an interface and interface can't create object
		                                       //so we use ChromeDriver() , here ChromeDriver is the class.
		driver.get("https://selenium.obsqurazone.com/index.php"); //this is to load url
		driver.manage().window().maximize(); //maximize the loaded url
		String title = driver.getTitle(); //to get title of the site
		System.out.println(title);
		
		
		String url = driver.getCurrentUrl();//get url of the current page
		System.out.println(url);
		
		String source = driver.getPageSource();//get html code
		System.out.println(source);
		
		driver.navigate().to("https://groceryapp.uniqassosiates.com/admin/login");//navigate to the url
		
		driver.navigate().back();//navigate to back page
		
		driver.navigate().forward();//navigate to next page
		
		//driver.close();//only close current browser window
		//driver.quit();//close all windows
		

	}

}
