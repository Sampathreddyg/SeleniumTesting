package SeleniumDemo1;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo2 extends Demo1 {
	
	public static void main(String[] args) {
		Demo2 d = new Demo2();
		d.launchBrowser("https://flipkart.com");
		String title = driver.getTitle();
		System.out.println("Page title: "+title);
		driver.navigate().to("https://amazon.in");
		System.out.println("Page title: "+driver.getTitle());
		driver.close();
		
	}

}
