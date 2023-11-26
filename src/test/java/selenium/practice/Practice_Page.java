package selenium.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Practice_Page {
	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testpages.eviltester.com/styled/validation/input-validation.html");
	
		driver.manage().window().maximize();
	
		driver.findElement(By.name("firstname")).sendKeys("tohidul"); driver.findElement(By.name("surname")).sendKeys("islam");
		driver.findElement(By.name("age")).sendKeys("26");
		driver.findElement(By.name("country")).sendKeys("United States of America"); driver.findElement(By.name("notes")).sendKeys("Beutiful Country to Travel");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.close();

	}
}
