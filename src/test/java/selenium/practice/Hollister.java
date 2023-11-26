package selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hollister {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hollisterco.com/shop/us/AccountRouterView?storeId=10251&catalogId=10201&langId=-1");
		driver.manage().window().maximize();
		driver.findElement(By.id("email-sign-in")).sendKeys("tohidulislam171997@gmail.com");
		driver.findElement(By.id("login-password-field-sign-in")).sendKeys("12345678@A");
		driver.findElement(By.xpath("//button[@type='submit'][1]")).click();
		driver.close();
		
	}

}
