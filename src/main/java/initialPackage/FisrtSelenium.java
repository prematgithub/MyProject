package initialPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FisrtSelenium {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\chromedriverwin32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// driver.findElement(By.xpath("//button[@name='login'")).click();

		// WEB ELEMENT METHODS
		// used to maximize browser instance
		driver.manage().window().maximize();

		// used to launch appln
		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.facebook.com/");
	
		WebDriverWait wait= new WebDriverWait(driver,30);
		
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//*[@id='login_link']/div[3]/a[@role='button']"))));
		driver.findElement(By.xpath("//*[@id='login_link']/div[3]/a[@role='button']")).click();
		// Get current page URl
		 String url = driver.getCurrentUrl();
		System.out.println("Current url is " + url);

		// Refresh the page
		Thread.sleep(3000);
		driver.navigate().refresh();

		// navigate back
		Thread.sleep(3000);
		driver.navigate().back();

		// navigate forward
		Thread.sleep(3000);
		driver.navigate().forward();

		// Getting title of current
		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println(title);

		Thread.sleep(3000);
		// Closing single browser instance
		// driver.close();

		driver.findElement(By.xpath("//*[@id='login_link']/div[3]/a[@role='button']"));
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("12346");

		Thread.sleep(5000);
		driver.quit();

	}

}
