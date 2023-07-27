package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class SignIn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver .get("https://magento.softwaretestingboard.com/");
		//Sign In
		//Sign In
		Wait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(30)).ignoring(Exception.class);
				
		driver.findElement(By.xpath("//ul[@class='header links']//a")).click();
				
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.id("email")).sendKeys("kamaliajay301299@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Magento@1");
		driver.findElement(By.id("send2")).click();		

	}

}
