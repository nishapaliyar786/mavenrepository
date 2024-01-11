package seleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    WebDriver driver = new ChromeDriver();
    driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
    driver.manage().window().maximize();
    
    WebElement checkboxDemo = driver.findElement(By.xpath("//a[text()='Checkbox Demo']"));
    checkboxDemo.click();
    
    WebElement checkbox1 = driver.findElement(By.id("check-box-one"));
    String tagName = checkbox1.getTagName();
    System.out.println(tagName);
    
    String valueOfTypeAttribute = checkbox1.getAttribute("type");//get the value 
    System.out.println(valueOfTypeAttribute);
    
    checkbox1.click();
    Boolean result = checkbox1.isSelected();
    System.out.println("first checkbox selected : "+result);
    
    WebElement radioButtonDemo = driver.findElement(By.xpath("//a[text()='Radio Buttons Demo']"));
    
    String fontfamily = radioButtonDemo.getCssValue("font-family");
    String fontsize = radioButtonDemo.getCssValue("font-size");
    
    System.out.println("font family : "+fontfamily+"font size : "+fontsize);
    radioButtonDemo.click();
    
    WebElement radioButtonFemale = driver.findElement(By.id("inlineRadio2"));
    radioButtonFemale.click();
    Boolean resultRadio = radioButtonFemale.isSelected();
    System.out.println("radio button female selected : "+resultRadio);
    
    
    //driver.quit();
	}

}
