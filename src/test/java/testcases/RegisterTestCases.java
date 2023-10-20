package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import PageObjectModel.RegisterPageObject;
import Resources.BaseClass;

public class RegisterTestCases extends BaseClass {

	@Test
	public void verifyRegister() throws IOException {

		initializeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");


		RegisterPageObject obj=new RegisterPageObject(driver);

		driver.manage().window().maximize();

		obj.NavigatetoMyAccount().click();
		obj.NevigatetoRegister().click();
		obj.FirstName().sendKeys("Shubham");
		obj.LastName().sendKeys("Patil");
		obj.Email().sendKeys("shubham7744088156@gmail.com");
		obj.telephone().sendKeys("7744088156");
		obj.password().sendKeys("shubham7744");
		obj.Confirmpassword().sendKeys("shubham7744");
		obj.RadioBtn().click();
		obj.checkbox().click();
		obj.submit().click();


	}
	}