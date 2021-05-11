package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Signin {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://www.hackerrank.com/");
		
		String title=driver.getTitle();
		if(title.equals("HackerRank")) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		driver.findElement(By.linkText("Sign Up")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Sign Up & Code')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#input-1")).sendKeys("Ehab Sarrawi");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#input-2")).sendKeys("e.2200@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#input-3")).sendKeys("Ehab@2000");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("body.hr-community:nth-child(2) div.ui-kit-root div.body-wrap.community-page.auth-page.signup-page div.show-cookie-banner div.theme-m.new-design div.community-content div.auth-container.container.theme-m div.auth-content-wrap div.auth-box-container div.auth-box div.ui-tabs-wrap.auth-content div.tab-list-content div.signup-form.auth-form.theme-m form.form div.form-item.clearfix:nth-child(4) > button.ui-btn.ui-btn-large.ui-btn-primary.auth-button.ui-btn-styled")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("intentOption")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("hackerTypeOption")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//body/div[@id='content']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/main[1]/form[1]/button[1]")).click();
        /* Log in only
		driver.findElement(By.linkText("Login")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/main[1]/article[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/a[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#input-1")).sendKeys("e.2000@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#input-2")).sendKeys("Ehab@2000");
		Thread.sleep(1000);
        driver.findElement(By.xpath("//body/div[@id='content']/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/div[4]/button[1]")).click();
//		driver.quit();*/
	}
}
