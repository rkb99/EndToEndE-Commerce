package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjectModel.LoginPageObject;
import Resources.BaseClass;
import Resources.cons;

public class logintestcases extends BaseClass  {
   @Test
	public void Login () throws IOException {



    	LoginPageObject obj1 =new LoginPageObject(driver);

    	driver.manage().window().maximize();

    	obj1.NevigateAccount().click();
    	obj1.NevigateToLogin().click();
    	obj1.EmailId().sendKeys(cons.ID);
    	obj1.Password().sendKeys(cons.Pass);
    	obj1.Submit().click(); 
	}
}