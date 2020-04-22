package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productpage {
	public WebDriver driver;
	@FindBy(id="selectProductSort")
	private WebElement sorting;
	
	@FindBy(id="layered_id_attribute_group_1")
	private WebElement getcheckbox;
	
	@FindBy(id="layered_id_attribute_group_15")
	private WebElement colorcheckbox;
	
	@FindBy(xpath="//a[@title='Delivery']")
	private WebElement delivery;

	public WebElement getSorting() {
		return sorting;
	}
	
	@FindBy(xpath="(//a[@title='Printed Summer Dress'])[2]")
	private WebElement dress;
	
	public Productpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	public Cartpage selectingthedress()
	{
		dress.click();
		return new Cartpage(driver);
	}
	
	public void delivery()
	{
		getcheckbox.click();
		colorcheckbox.click();
		delivery.click();
	}
	
	
	

}
