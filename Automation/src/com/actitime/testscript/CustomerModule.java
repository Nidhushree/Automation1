package com.actitime.testscript;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.actitime.testscript.ListenerImplementation.class)
public class CustomerModule extends BaseClass {
	@Test
	public void createCustomer() throws InterruptedException {
		Reporter.log("createcustomer", true);
		Thread.sleep(2000);
		Assert.fail();
		
		
	}
}
	


		
	
		

	


