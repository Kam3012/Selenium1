package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//div[@class='_6ltg']/a[text()='Create new account']")).click();
		
		//Sign up form
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Kamali");
		driver.findElement(By.name("lastname")).sendKeys("D");
		driver.findElement(By.name("reg_email__")).sendKeys("kd1234@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("kd1234@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Kamali@1234");
		//Select DOB using Select class
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement Day = driver.findElement(By.id("day"));
		Select day = new Select(Day);
		day.selectByValue("30");
		//Thread.sleep(3000);
		WebElement Month = driver.findElement(By.xpath("//select[@id='month']"));
		Select month = new Select(Month);
		System.out.print("I am here");
		month.selectByVisibleText("Dec");
		WebElement Year = driver.findElement(By.id("year"));
		Select year = new Select(Year);
		year.selectByValue("1999");
		//Select gender.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement radio1 = driver.findElement(By.xpath("//label[text()='Female']"));
		WebElement radio2 = driver.findElement(By.xpath("//label[text()='Male']"));
		WebElement radio3 = driver.findElement(By.xpath("//label[text()='Custom']"));
		
		if(!radio1.isSelected()) {
			radio1.click();
		}
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
	}

}
