//package methods;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//
//public class Login_pagefactory {
//	
////	@FindBy(xpath = "//input[@formcontrolname='username']")
////    WebElement txt_username;
////	
////	@FindBy(xpath = "//input[@formcontrolname='password']")
////	WebElement txt_password;
////	
////	@FindBy(xpath = "//span[text()=' Login ']")
////	WebElement btn_login;
//	public WebDriver driver;
//	By txt_username=By.xpath("//input[@formcontrolname='username']");
//	By txt_password=By.xpath("//input[@formcontrolname='password']");
//	By btn_login=By.xpath("//span[text()=' Login ']");
//	
//	
//	public Login_pagefactory(WebDriver driver) {
//		this.driver= driver;
//	
//	}
//	
//	public void enterusername(String username) {
//		driver.findElement(txt_username).sendKeys(username);;
//	}
//	
//	public void enterpassword(String password) {
//	 driver.findElement(txt_password).sendKeys(password);;
//	}
//	
//	public void clicklogin() {
//		driver.findElement(btn_login).click();
//	}
//}
