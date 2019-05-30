package mercurysite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class N {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","F:\\New folder\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
    	driver.get("https://mail.google.com");
		driver.findElement(By.xpath("//input[@jsname='YPqjbf'][1]")).sendKeys("vijjinaresh99@gmail.com");
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		// WebDriverWait wait = new WebDriverWait(driver, 10);
		// wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Next']")));

		//driver.findElement(By.name("password")).sendKeys("naresh99");
		//driver.findElement(By.xpath("//*[text()='Next']")).click();

		
		
	}

}
