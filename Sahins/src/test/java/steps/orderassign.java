//package steps;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import io.cucumber.java.en.*;

//public class orderassign {
//	
//	WebDriver driver= new FirefoxDriver();
//	
//	//public WebDriver driver = new ChromeDriver();
//	//Login_pagefactory login;
//    //Login_pagefactory login= new Login_pagefactory(driver);
//
//	@Given("Navigate to sahins url")
//	public void navigate_to_sahins_url() {
//		//ChromeOptions options = new ChromeOptions();
//		//options.addArguments("--remote-allow-orgins=*");
//       // 	 System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\Sahins\\src\\test\\resources\\driver\\chromedriver.exe");
//		
//		//options.addArguments("--remote-allow-orgins=*");
//		//DesiredCapabilities cp= new DesiredCapabilities();
//		//cp.setCapability(ChromeOptions.CAPABILITY, true);
//	    //options.merge(cp);
//	
//	//	System.setProperty("webdriver.http.factory", "jdk-http-client");
//
//			
//	    driver.get("http://sahins-dev.agiratech.com");
//	    driver.manage().window().maximize();
//	    System.out.println("user in sahins login page");
//	}
//	@When("user enter username and password")
//	public void user_enter_username_and_password() {
//		driver.findElement(By.xpath("//input[@formcontrolname='username']")).sendKeys("sahins@agiratech.com");
//		driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys("Sahins@123");
//		System.out.println("user enterd user name & passowrd");
//		
//	}
//	@And("user clicks login button")
//	public void user_clicks_login_button() {
//		driver.findElement(By.xpath("//span[text()=' Login ']")).click();
//		System.out.println("user logged in successfully");
//	}
//
//	@Then("user in dashboard")
//	public void user_in_dashboard() {
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	   driver.findElement(By.xpath("//span[text()='Dashboard']")).isDisplayed();
//	   System.out.println("user in dashboard");
//	}
//	@And("user clicks order management")
//	public void user_clicks_order_management() {
//		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//span[text()='Order Management']")).click();
//		driver.findElement(By.xpath("//span[text()=' Order List']")).click();
//	}
//	@And("user clicks refresh button")
//	public void user_clicks_refresh_button() throws InterruptedException {
//		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//		WebElement element = driver.findElement(By.xpath("//b[text()='Refresh']"));
//		Actions actions = new Actions(driver);
//		actions.moveToElement(element).click().build().perform();
//		System.out.println("user clicks refresh button");
//	}
//
//	@And("user clicks order ID")
//	public void user_clicks_order_id() {
//		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
//	   driver.findElement(By.xpath("(//td[@role='cell'])[1]")).click();
//	   System.out.println("user clicks order ID & enters order details page");
//	   
//	}
//
//	@And("user in order details page")
//	public void user_in_order_details_page() throws InterruptedException {
//	    driver.findElement(By.xpath("//span[text()=' Assign Phlebo ']")).click();
//	    Thread.sleep(1000);
//	    System.out.println("user clicks assign phlebo button");
//	    
//	}
//
//	@And("user clicks assign phlebo button")
//	public void user_clicks_assign_phlebo_button() throws InterruptedException {
//	    driver.findElement(By.xpath("//input[@placeholder='Search By Name, Phone Number']")).sendKeys("phlebo two");
//	    Thread.sleep(2000);
//	    driver.findElement(By.xpath("//span[text()=' Assign ']")).click();
//	    Thread.sleep(2000);
//	    System.out.println("user assign phlebo");
//	}
//
//	@Then("user assign phlebo")
//	public void user_assign_phlebo() throws InterruptedException {
//	    driver.findElement(By.xpath("//a[text()='Details']")).click();
//	    Thread.sleep(2000);
//	    driver.findElement(By.xpath("(//div[contains(text(),'Order Assigned')])[1]")).isDisplayed();
//	    driver.findElement(By.xpath("(//div[contains(text(),'Order Assigned')])[1]")).click();
//	    System.out.println("user checks order status");
//	}
//	@And("Back to order list")
//	public void Back_to_order_list(){
//		driver.findElement(By.xpath("//span[contains(text(),' Back to Order list ')]")).click();
//		System.out.println("user goes back to order list");
//	}
//
//
//
//}
