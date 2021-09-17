package saleniumpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				System.setProperty("webdriver.chrome.driver","C:\\saleniumproject\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://opensource-demo.orangehrmlive.com");
				driver.manage().window().maximize();
				Thread.sleep(2000);
				
				driver.findElement(By.id("txtUsername")).sendKeys("Admin");
				Thread.sleep(2000);
				
				driver.findElement(By.id("txtPassword")).sendKeys("admin123");
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//input[@name='Submit']")).click();
				
				
				driver.findElement(By.id("welcome")).click();
				driver.findElement(By.linkText("Logout")).click();
				
				/*WebElement tab=driver.findElement(By.id("welcome"));
				 tab.click();
				 Select t=new Select(tab);
				 t.selectByVisibleText("Logout");*/
				 
				 
				 
			}



	}


