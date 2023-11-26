package selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automation_Exercise {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.automationexercise.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Signup / Login")).click();
		driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("tohidulislam171997@gmail.com");
		driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("12345678@A");
		driver.findElement(By.xpath("//button[@data-qa='login-button']")).click();
		driver.close();
		
	}

}
