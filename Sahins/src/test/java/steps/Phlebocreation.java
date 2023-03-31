package steps;

import java.io.IOException;
import java.sql.Driver;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.javafaker.Faker;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Phlebocreation {
      WebDriver driver= new EdgeDriver();
      
      Faker faker = new Faker();
      String name= faker.name().username();
//      String firstname= faker.name().firstName();
//      String lastname= faker.name().lastName();
      String email= name.toLowerCase()+"@agiratech.com";
      

  	@Given("Navigate to sahins url")
  	public void navigate_to_sahins_url() {
//  		ChromeOptions options = new ChromeOptions();
//  		options.addArguments("--remote-allow-orgins=*");
//          	 System.setProperty("webdriver.chrome.driver", "C:\\Eclipse\\Sahins\\src\\test\\resources\\driver\\chromedriver.exe");
//  		
//  		options.addArguments("--remote-allow-orgins=*");
//  		DesiredCapabilities cp= new DesiredCapabilities();
//  		cp.setCapability(ChromeOptions.CAPABILITY, true);
//  	    options.merge(cp);
//  	
//  		System.setProperty("webdriver.http.factory", "jdk-http-client");
  
  			
  	    driver.get("http://sahins-dev.agiratech.com");
  	    driver.manage().window().maximize();
  	    System.out.println("user in sahins login page");
  	}
  	@When("user enter username and password")
  	public void user_enter_username_and_password() {
  		driver.findElement(By.xpath("//input[@formcontrolname='username']")).sendKeys("sahins@agiratech.com");
  		driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys("Sahins@123");
  		System.out.println("user enterd user name & passowrd");
  		
  	}
  	@And("user clicks login button")
  	public void user_clicks_login_button() {
  		driver.findElement(By.xpath("//span[text()=' Login ']")).click();
  		System.out.println("user logged in successfully");
  	}
  
  	@Then("user in dashboard")
  	public void user_in_dashboard() {
  		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  	   driver.findElement(By.xpath("//span[text()='Dashboard']")).isDisplayed();
  	   System.out.println("user in dashboard");
  	}

@And("user clicks user management")
public void user_clicks_user_management() {
  driver.findElement(By.xpath("//span[text()='User Management']")).click();
     
}

@And("user clicks customer management")
public void user_clicks_customer_management() {
 driver.findElement(By.xpath("//span[text()=' Customer Management']")).click();
}

@And("user clicks create button")
public void user_clicks_create_button() throws InterruptedException {
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	WebElement element = driver.findElement(By.xpath("//button[@class='btn-icons']"));
    Actions actions = new Actions(driver);
	actions.moveToElement(element).click().build().perform();
	driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	System.out.println("user clicks create customer button");
	Thread.sleep(2000);
  
}

@And("user enters all mandatory fields")
public void user_enters_all_mandatory_fields() throws IOException, InterruptedException {
	
  driver.findElement(By.xpath("//input[@formcontrolname='name']")).sendKeys(name);
   driver.findElement(By.xpath("//mat-icon[@svgicon='appCalendar']")).click();
   driver.findElement(By.xpath("//button[@aria-label='Choose month and year']")).click();
//   String year = "2000";
//   String month="march";
//   String day="20";
//   while(true)
//   {
//   String text=driver.findElement(By.xpath("//div[text()=' 2000 ']")).getText();
//   if (text.equals(year))
//   {
//	   break;
//   }
//   }
   driver.findElement(By.xpath("//div[text()=' 2000 ']")).click();
   driver.findElement(By.xpath("//div[text()=' MAR ']")).click();
   driver.findElement(By.xpath("//div[text()=' 20 ']")).click();
   driver.findElement(By.xpath("(//span[text()='Gender'])[2]")).click();
   driver.findElement(By.xpath("//span[text()='Male']")).click();
   driver.findElement(By.xpath("//input[@formcontrolname='mobile_number']")).sendKeys(faker.phoneNumber().phoneNumber());
   driver.findElement(By.xpath("//input[@formcontrolname='email']")).sendKeys(email);
   driver.findElement(By.xpath("//mat-select[@formcontrolname='country']")).click();
   driver.findElement(By.xpath("//span[text()='India']")).click();
   driver.findElement(By.xpath(("(//span[text()='State'])[2]"))).click();
   driver.findElement(By.xpath("//span[text()='Tamil Nadu']")).click();
   driver.findElement(By.xpath("//input[@formcontrolname='district']")).sendKeys("Chennai");
   driver.findElement(By.xpath("(//span[text()='City'])[2]")).click();
   driver.findElement(By.xpath("//span[text()='Ambattur']")).click();
   driver.findElement(By.xpath("//input[@formcontrolname='pincode']")).sendKeys("600028");
   driver.findElement(By.xpath("//input[@formcontrolname='address']")).sendKeys("Shop Street, Near Venaktapuram Mosque, Ambattur, Chennai,");
   driver.findElement(By.xpath("//span[text()=' Upload Image ']")).click();
   Thread.sleep(2000);
   Runtime.getRuntime().exec("C:\\videos\\selenium notes\\upload.exe");
   driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
   System.out.println("customer mandatory details entered");
}


@Then("user clicks register button")
public void user_clicks_register_button() throws InterruptedException {
  //driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);	
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
//  WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
//	        .until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()=' Register ']")));
  driver.findElement(By.xpath("//span[text()=' Register ']")).click();
  Thread.sleep(2000);
  System.out.println("Customer created successfully");
}

@Then("verify created customer in table")
public void verify_created_customer_in_table() {
	driver.findElement(By.xpath("(//td[@role='cell'][2])[1]")).equals(name);
	System.out.println("Customer creation verify success");
}
      
}
