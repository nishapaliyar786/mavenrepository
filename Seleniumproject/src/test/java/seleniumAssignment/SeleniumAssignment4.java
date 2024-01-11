package seleniumAssignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumAssignment4 {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
        
		WebDriver driver = new ChromeDriver();
		driver.get("http://groceryapp.uniqassosiates.com/admin/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement uname = driver.findElement(By.xpath("(//input[@class='form-control'])[1]"));
		uname.sendKeys("admin");//pass username
		
		WebElement pwd = driver.findElement(By.xpath("(//input[@class='form-control'])[2]"));
		pwd.sendKeys("admin");//pass password
		
		WebElement checkRemember = driver.findElement(By.xpath("//label[@for='remember']"));
		Boolean result = checkRemember.isSelected();
		System.out.println("Checkbox selected : "+result);
		
		WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		loginbutton.click();
		
		WebElement admin = driver.findElement(By.className("d-block"));
		Boolean display = admin.isDisplayed();
		System.out.println("aDMIN DISPLAY : "+display);//verify the text “Admin” is displayed or not in home page
		
		WebElement manageExpense = driver.findElement(By.xpath("(//i[@class='fas fa-angle-left right'])[2]"));
		manageExpense.click();
		
		WebElement manageExpenseRadio = driver.findElement(By.xpath("//a[@href='http://groceryapp.uniqassosiates.com/admin/list-expense']"));
		manageExpenseRadio.click();
		
		//driver.navigate().to("http://groceryapp.uniqassosiates.com/admin/list-expense");
		
		WebElement newButton = driver.findElement(By.xpath("//a[@class='btn btn-rounded btn-danger']"));
		newButton.click();
		
		WebElement user = driver.findElement(By.id("user_id"));
		Select select = new Select(user);
		select.selectByIndex(2);
		
		WebElement category = driver.findElement(By.id("ex_cat"));
		Select select1 = new Select(category);
		select1.selectByVisibleText("FruitNew");
		
		WebElement orderID= driver.findElement(By.id("order_id"));
		Select select2 = new Select(orderID);
		select2.selectByValue("4");
		
		WebElement purchaseID = driver.findElement(By.id("purchase_id"));
		Select select3 = new Select(purchaseID);
		select3.selectByIndex(3);
		
		
		WebElement extype = driver.findElement(By.id("ex_type"));
		Select select4 = new Select(extype);
		select4.selectByIndex(3);
		
		WebElement amount = driver.findElement(By.id("amount"));
		amount.sendKeys("1000");
		
		WebElement userfile = driver.findElement(By.xpath("//input[@type='file']"));
		userfile.submit();
		
		Robot robot = new Robot();
        StringSelection filePath = new StringSelection("D:\\Obsquara\\Automation_Ansala\\Screenshot_Assignment1.docx");
        
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(filePath, null);
        robot.keyPress(KeyEvent.VK_CONTROL);//press control key
        robot.delay(2);
        robot.keyPress(KeyEvent.VK_V);//press V key
        
        robot.keyRelease(KeyEvent.VK_CONTROL);//release control key
        robot.delay(2);
        robot.keyRelease(KeyEvent.VK_V);//release V key
        
        robot.keyPress(KeyEvent.VK_ENTER);//press enter key
        robot.delay(2);
        robot.keyRelease(KeyEvent.VK_ENTER);//release enter key
        //System.out.println("file upload successfully");
        
        WebElement saveButton = driver.findElement(By.name("create"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",saveButton);
        js.executeScript("arguments[0].click();",saveButton);
        //saveButton.click();  
        
        WebElement alert_success = driver.findElement(By.xpath("//div[contains(@class,'alert alert-success')]"));
        
        System.out.println(alert_success.getText());
       
		
		
	}

}
