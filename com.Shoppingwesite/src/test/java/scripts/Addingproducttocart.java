package scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericlib.Basetest;
import genericlib.Propertyfile;
import genericlib.Utilies;
import pages.Cartpage;
import pages.Homepage;
import pages.Loginpage;
import pages.Productpage;

public class Addingproducttocart extends Basetest{
	@Test
	public void addingtocart()
	{
		Utilies u=new Utilies();
		u.implicitywait(driver);
		Loginpage l=new Loginpage(driver);
		
		Homepage h = l.logincredentials(Propertyfile.getdata("emailaddress"),Propertyfile.getdata("password"));
		Assert.assertEquals(Propertyfile.getdata("homepagetitle"),"My account - My Store");
		Productpage c = h.serachingforproduct(Propertyfile.getdata("productname"));
		u.dropdown(c.getSorting(),Propertyfile.getdata("select"));
		Cartpage a = c.selectingthedress();
		for(int i=0;i<=5;i++)
		{
		a.plus();
		}
        u.dropdown(a.getSizedd(),Propertyfile.getdata("size"));
		a.addingtocart();
		Assert.assertEquals(Propertyfile.getdata("Endpagetitle"),"Order - My Store");
		
	}

}
