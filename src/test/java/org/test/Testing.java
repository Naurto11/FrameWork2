package org.test;

import java.io.IOException;

import org.base.BaseClass;
import org.login.LoginPojo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testing extends BaseClass {

	
	
	@BeforeClass
	private void browserLaunch() {

		launchBrowser();
		maxBrowser();
	}

	@AfterClass
	private void browserClose() {
		closebrowser();

	}

	@BeforeMethod
	public void startstime() {
		passUrl("https://adactinhotelapp.com/SearchHotel.php");
		
	}

	@AfterMethod
	public void endsTime() throws InterruptedException {

		Thread.sleep(3000);

	}
	
	@Test
	private void testCase1() throws IOException {

		LoginPojo l=new LoginPojo();
		toInput(l.getTxtuser(), excelRead(2, 3));
		toInput(l.getTxtpass(), excelRead(4, 3));
		btnClick(l.getLognbtn());
	}
	
	
	
}
