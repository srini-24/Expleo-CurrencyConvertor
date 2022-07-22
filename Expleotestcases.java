package com.expleo.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.kwixee.base.TestBase;
import com.kwixee.extentreports.ExtentTestManager;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.calculate.Page.Calculate_B;
import com.disablefeature.pages.Disable_S;
import com.expleo.test.*;
import com.kwixee.base.TestBase;
import com.kwixee.extentreports.ExtentTestManager;
import com.kwixee.pages.LoginPage;

public class Expleotestcases extends TestBase{
	
	private LoginPage  loginPage=new LoginPage();
	private Disable_S disable_S=new Disable_S();
	private Expleo_S expleo_s=new Expleo_S();
	private Expleo_S1 expleo_s1=new Expleo_S1();
	
	@Test(priority=1)
	public void ExpleoTestcases() throws InterruptedException, IOException {
		boolean status=false;
		ExtentTestManager.createTest("CurrencyEURToGBP","Currrency Converter");
		//status=loginPage.login(driver,username,password);
		//Assert.assertTrue(status);	
		status=expleo_s1.CurrencyConvertEuroToGBP(driver);
		Assert.assertTrue(status);
	}
	
	@Test(priority=2)
	public void ExpleoTestcases2() throws InterruptedException, IOException {
		boolean status=false;
		ExtentTestManager.createTest("CurrencyGBPToEuro","Currrency Converter");
		//status=loginPage.login(driver,username,password);
		//Assert.assertTrue(status);	
		status=expleo_s1.CurrencyConvertGBPtoEuro(driver);
		Assert.assertTrue(status);
	}
	
	@Test(priority=3)
	public void ExpleoTestcases3() throws InterruptedException, IOException {
		boolean status=false;
		ExtentTestManager.createTest("CurrencyUSDToINR","Currrency Converter");
		//status=loginPage.login(driver,username,password);
		//Assert.assertTrue(status);	
		status=expleo_s1.CurrencyConvertUSDtoINR(driver);
		Assert.assertTrue(status);
	}
	
	@Test(priority=4)
	public void ExpleoTestcases4() throws InterruptedException, IOException {
		boolean status=false;
		ExtentTestManager.createTest("CurrencyEURToINR","Currrency Converter");
		//status=loginPage.login(driver,username,password);
		//Assert.assertTrue(status);	
		status=expleo_s1.CurrencyConvertEURtoINR(driver);
		Assert.assertTrue(status);
	}
	
	@Test(priority=5)
	public void ExpleoTestcases5() throws InterruptedException, IOException {
		boolean status=false;
		ExtentTestManager.createTest("CurrencyCADToINR","Currrency Converter");
		//status=loginPage.login(driver,username,password);
		//Assert.assertTrue(status);	
		status=expleo_s1.CurrencyConvertCADtoINR(driver);
		Assert.assertTrue(status);
	}

}
