package locators;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver .get("https://magento.softwaretestingboard.com/");
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		//Click on create account
		WebElement createlink = driver.findElement(By.xpath("//*[text()='Create an Account']"));
		createlink.click();
		
		//Enter the details
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("firstname")).sendKeys("Kamali");
		driver.findElement(By.id("lastname")).sendKeys("D");
		driver.findElement(By.id("email_address")).sendKeys("kama@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Magento@1");
		driver.findElement(By.id("password-confirmation")).sendKeys("Magento@1");
		//Explicit wait
		WebDriverWait webdwait = new WebDriverWait(driver,Duration.ofSeconds(5));
		webdwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@type='submit']/span[text()='Create an Account']")));
		driver.findElement(By.xpath("//button[@type='submit']/span[text()='Create an Account']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/span/button")).click();
		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/div/ul/li[3]/a")).click();
		
		
		
		
	}

}
