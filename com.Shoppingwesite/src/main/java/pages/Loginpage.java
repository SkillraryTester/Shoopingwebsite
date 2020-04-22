package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	public WebDriver driver;
	@FindBy(xpath="//a[contains(.,'Sign in')]")
	private WebElement signinbtn;
	
	@FindBy(id="email")
	private WebElement emailtb;
	
	@FindBy(id="passwd")
	private WebElement passwordtb;
	
	@FindBy(id="SubmitLogin")
	private WebElement sumbitbtn;
	
	@FindBy(id="newsletter-input")
	private WebElement emailbox;
	
	@FindBy(name="submitNewsletter")
	private WebElement go;
	
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	public Homepage logincredentials(String email,String password)
	{
		signinbtn.click();
		emailtb.sendKeys(email);
		passwordtb.sendKeys(password);
		sumbitbtn.click();
		return new Homepage(driver);
		
	}
	
	public Homepage enteremail(String mail)
	{
		emailbox.sendKeys(mail);
		go.click();
		return new Homepage(driver);
	}

}
