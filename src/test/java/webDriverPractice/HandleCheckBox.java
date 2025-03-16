package webDriverPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleCheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriver driver =new ChromeDriver();
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	
	//select specific textbox
		//driver.findElement(By.id("sunday")).click();
	
	//select all the checkboxes
	
	List<WebElement> checkboxes =driver.findElements(By.xpath("//input[@class='form-check form-check-inline'and @type='checkbox']"));
	for (int i=0;i<checkboxes.size();i++)
	{
		checkboxes.get(i).click();
	}
	}

}
