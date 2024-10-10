package SeleniumDemo1;

public class Demo2 extends Demo1 {
	
	public static void main(String[] args) {
		Demo2 d = new Demo2();
		d.launchBrowser("https://flipkart.com");
		String title = driver.getTitle();
		System.out.println("Page title: "+title);
		driver.close();
		
	}

}
