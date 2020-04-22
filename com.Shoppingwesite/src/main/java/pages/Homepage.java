package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	public WebDriver driver;
	@FindBy(id="search_query_top")
	private WebElement serchtb;
	
	@FindBy(name="submit_search")
	private WebElement serachbtn;
	
	@FindBy(xpath="(//a[.='Dresses'])[2]")
	private WebElement dress;
	
	public WebElement getDress() {
		return dress;
	}
	
	@FindBy(xpath="(//a[.='Summer Dresses'])[2]")
	private WebElement summerdress;

	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	public Productpage serachingforproduct(String product)
	{
		serchtb.sendKeys(product);
		serachbtn.click();
		return new Productpage(driver);
		
	}
	
	public Productpage dressmm()
	{
		summerdress.click();
		return new Productpage(driver);
	}

}
