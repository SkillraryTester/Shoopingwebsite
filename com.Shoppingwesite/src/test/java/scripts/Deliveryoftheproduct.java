package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericlib.Basetest;
import genericlib.Propertyfile;
import genericlib.Utilies;
import pages.Homepage;
import pages.Loginpage;
import pages.Productpage;

public class Deliveryoftheproduct extends Basetest{
	@Test
	public void deliveryproduct()
	{
		Utilies u=new Utilies();
		u.implicitywait(driver);
		Loginpage l=new Loginpage(driver);
		Homepage h = l.enteremail(Propertyfile.getdata("emailaddress"));
		u.mousehover(driver,h.getDress());
		Productpage p = h.dressmm();
		p.delivery();
		Assert.assertEquals(Propertyfile.getdata("deliverypagetitle"),"Delivery - My Store");
		
	}
	

}
