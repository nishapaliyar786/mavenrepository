package seleniumAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAssigment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriver driver = new ChromeDriver();
     driver.get("https://groceryapp.uniqassosiates.com/home");//load url
     driver.manage().window().maximize();//maximize the window
     String a = driver.getTitle();
     System.out.println(a);//print the title of the page
     
     WebElement bdytextlink = driver.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/electronics?p']"));
     bdytextlink.click();//click on electronics tab
//     
     String url = driver.getCurrentUrl();//get url of the current page
		System.out.println(url);//print current url from electronics page
		
		WebElement electronicstext = driver.findElement(By.xpath("//h1[contains(text(),'Electronics (13)')]"));
		String text = electronicstext.getText();
		System.out.println(text);//print the page heading  "Electronics(13)"
//		
		
		driver.navigate().back();//navigate back to home page
		driver.navigate().refresh();//refresh the page
//		
		WebElement fruitlink = driver.findElement(By.xpath("//a[@href='https://groceryapp.uniqassosiates.com/fruits?p']"));
		fruitlink.click();//click on fruits tab
		String url1 = driver.getCurrentUrl();
		System.out.println(url1);//print current url from fruits page
		
		WebElement add_to_cartbutton = driver.findElement(By.xpath("//a[@onclick='add_to_cart(1056)']"));
		add_to_cartbutton.click();//click add to cart button of sunflower oil
		driver.navigate().refresh();//refresh the page
		
		WebElement sunfloweroil = driver.findElement(By.xpath("//a[@href='javascript:void(0);']"));  //also use text
		String sunoil = sunfloweroil.getText();
		System.out.println(sunoil);//print the productname sunflower oil from the basket
		
		driver.navigate().back();
		driver.manage().window().minimize();
		driver.close();
		
	}

}
