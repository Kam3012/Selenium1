package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LocatorsExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		// Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		 
		driver.get("https://www.facebook.com/");
		WebElement username=driver.findElement(By.xpath("//input[@type='text']"));
		//Thread.sleep(3000);
		WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		//Thread.sleep(3000);
		WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
		username.sendKeys("8870211811");
		password.sendKeys("XXXX");
		login.click();
		
		

	}

}
