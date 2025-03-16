package webDriverPractice;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.partialLinkText("OrangeHRM")).click();
		
		Set<String>windowIds = driver .getWindowHandles();
		
		//Approach 1
		/*List <String> windowList = new ArrayList(windowIds);
		
		String parentID=windowList.get(0);
		String childID=windowList.get(1);
		
		//switch to chlid window
		driver.switchTo().window(childID);
		System.out.println(driver.getTitle());
		
		//switch to parent window
		driver.switchTo().window(parentID);
		System.out.println(driver.getTitle()); */
		
		//Approach 2
		for(String winId:windowIds)
		{
			String title=driver.switchTo().window(winId).getTitle();
			
			if(title.equals("OrangeHRM")) {
				System.out.println(driver.getCurrentUrl());
			}
		}
		
		
	}

}
