package com.expleo.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.kwixee.base.TestBase;
import com.kwixee.util.TestUtil;

public class Expleo_S1 {
	
	public boolean status=false;
	private TestUtil TestUtil=new TestUtil();
	
	String currency="EUR";
	String currency1="GBP";
	public By amt_locator=By.xpath("//input[contains(@id,'amo')]");
	public By close_locator=By.xpath("//button[contains(@aria-label,'close')]");
	public By accept_locator=By.xpath("//button[contains(text(),'Accept')]");
	public By fromcurrenccy_locator=By.xpath("//input[contains(@id,'midmarketFromCurrency')]");
	public By fromdrp_locator=By.xpath("//*[(contains(@class,'converterform-dropdown__option') or contains(@class,'ListboxOption')) and contains(.,'"+currency+"')]");
	public By todrp_locator=By.xpath("//*[(contains(@class,'converterform-dropdown__option') or contains(@class,'ListboxOption')) and contains(.,'"+currency1+"')]");
	public By tocurrrency_locator=By.xpath("//input[contains(@id,'midmarketToCurrency')]");
	public By convert_btn=By.xpath("//button[contains(@type,'submit')][contains(@class,'button__BaseButton')]");
	
	public boolean CurrencyConvertEuroToGBP(WebDriver driver){

		try{
			
			TestUtil.waitForElement(driver, accept_locator);
			Thread.sleep(1000);
			status=TestUtil.ClickElement(driver, accept_locator);		
			if(status) {
				TestUtil.Log(status,"Click on Accept Passed");
			}else {
				TestUtil.Log(status,"Click on Accept failed");
				return false;
			}
			
			
			TestUtil.waitForElement(driver, close_locator);
			Thread.sleep(1000);
			status=TestUtil.ClickElement(driver, close_locator);		
			if(status) {
				TestUtil.Log(status,"Click on Close Icon Passed");
			}else {
				TestUtil.Log(status,"Click on Close Icon failed");
				return false;
			}
			
			Thread.sleep(3000);
			status=CurrencyConvertMethod(driver,"300","EUR","GBP");
			if(!status){
				TestUtil.Log(status, "Currency Converter Method Failed");
				return false;
			}
		}
		catch(Exception e){
			return false;
		}
		return true;
	}
	
	public boolean CurrencyConvertGBPtoEuro(WebDriver driver){

		try{
			
			TestUtil.waitForElement(driver, accept_locator);
			Thread.sleep(1000);
			status=TestUtil.ClickElement(driver, accept_locator);		
			if(status) {
				TestUtil.Log(status,"Click on Accept Passed");
			}else {
				TestUtil.Log(status,"Click on Accept failed");
				return false;
			}
			
			
			TestUtil.waitForElement(driver, close_locator);
			Thread.sleep(1000);
			status=TestUtil.ClickElement(driver, close_locator);		
			if(status) {
				TestUtil.Log(status,"Click on Close Icon Passed");
			}else {
				TestUtil.Log(status,"Click on Close Icon failed");
				return false;
			}
			
			Thread.sleep(3000);
			status=CurrencyConvertMethod(driver,"300","GBP","EUR");
			if(!status){
				TestUtil.Log(status, "Currency Converter Method Failed");
				return false;
			}
			
		}
		catch(Exception e){
			return false;
		}
		return true;
	}
	
	public boolean CurrencyConvertUSDtoINR(WebDriver driver){

		try{
			
			TestUtil.waitForElement(driver, accept_locator);
			Thread.sleep(1000);
			status=TestUtil.ClickElement(driver, accept_locator);		
			if(status) {
				TestUtil.Log(status,"Click on Accept Passed");
			}else {
				TestUtil.Log(status,"Click on Accept failed");
				return false;
			}
			
			
			TestUtil.waitForElement(driver, close_locator);
			Thread.sleep(1000);
			status=TestUtil.ClickElement(driver, close_locator);		
			if(status) {
				TestUtil.Log(status,"Click on Close Icon Passed");
			}else {
				TestUtil.Log(status,"Click on Close Icon failed");
				return false;
			}
			
			
			Thread.sleep(3000);
			status=CurrencyConvertMethod(driver,"3000","USD","INR");
			if(!status){
				TestUtil.Log(status, "Currency Converter Method Failed");
				return false;
			}
		}
		catch(Exception e){
			return false;
		}
		return true;
	}
	
	public boolean CurrencyConvertEURtoINR(WebDriver driver){

		try{
			
			TestUtil.waitForElement(driver, accept_locator);
			Thread.sleep(1000);
			status=TestUtil.ClickElement(driver, accept_locator);		
			if(status) {
				TestUtil.Log(status,"Click on Accept Passed");
			}else {
				TestUtil.Log(status,"Click on Accept failed");
				return false;
			}
			
			
			TestUtil.waitForElement(driver, close_locator);
			Thread.sleep(1000);
			status=TestUtil.ClickElement(driver, close_locator);		
			if(status) {
				TestUtil.Log(status,"Click on Close Icon Passed");
			}else {
				TestUtil.Log(status,"Click on Close Icon failed");
				return false;
			}
			
			
			
			Thread.sleep(3000);
			status=CurrencyConvertMethod(driver,"3000","EUR","INR");
			if(!status){
				TestUtil.Log(status, "Currency Converter From EURO to INR  Method Failed");
				return false;
			}
		}
		catch(Exception e){
			return false;
		}
		return true;
	}
	
	public boolean CurrencyConvertCADtoINR(WebDriver driver){

		try{
			
			TestUtil.waitForElement(driver, accept_locator);
			Thread.sleep(1000);
			status=TestUtil.ClickElement(driver, accept_locator);		
			if(status) {
				TestUtil.Log(status,"Click on Accept Passed");
			}else {
				TestUtil.Log(status,"Click on Accept failed");
				return false;
			}
			
			
			TestUtil.waitForElement(driver, close_locator);
			Thread.sleep(1000);
			status=TestUtil.ClickElement(driver, close_locator);		
			if(status) {
				TestUtil.Log(status,"Click on Close Icon Passed");
			}else {
				TestUtil.Log(status,"Click on Close Icon failed");
				return false;
			}
			
			
			
			Thread.sleep(3000);
			status=CurrencyConvertMethod(driver,"3000","CAD","INR");
			if(!status){
				TestUtil.Log(status, "Currency Converter From CAD to INR  Method Failed");
				return false;
			}
		}
		catch(Exception e){
			return false;
		}
		return true;
	}
	
	public boolean CurrencyConvertMethod(WebDriver driver, String Amount,String FromCurrency,String ToCurrency){

		try{
			
			TestUtil.waitForElement(driver, amt_locator);
			Thread.sleep(1000);
			status=TestUtil.ClickElement(driver, amt_locator);		
			if(status) {
				TestUtil.Log(status,"Click on Amount Locator Passed");
			}else {
				TestUtil.Log(status,"Click on Amount Locator failed");
				return false;
			}
			
			
			Thread.sleep(3000);
			TestUtil.waitForElement(driver, amt_locator);
			status=TestUtil.EnterText(driver, amt_locator, Amount);
			if(status){
				TestUtil.Log(status,"Enter Amount "+Amount+" in Amount Field" );
			}else{
				TestUtil.Log(status,"Enter Amount in Amount Field  : "+Amount +" failed");
				return false;
			}
			
			TestUtil.waitForElement(driver, fromcurrenccy_locator);
			Thread.sleep(1000);
			status=TestUtil.ClickElement(driver, fromcurrenccy_locator);		
			if(status) {
				TestUtil.Log(true,"Click on From Currency Passed");
			}else {
				TestUtil.Log(false,"Click on Amount Locator failed");
			}
			
			Thread.sleep(3000);
			By fromdrp_locator1=By.xpath("//*[(contains(@class,'converterform-dropdown__option') or contains(@class,'ListboxOption')) and contains(.,'"+FromCurrency+"')]");
			TestUtil.waitForElement(driver, fromcurrenccy_locator);
			status=TestUtil.EnterText(driver, fromcurrenccy_locator, FromCurrency);
			if(status){
				TestUtil.Log(status,"Entered Currency in From Field  : "+FromCurrency);
			}else{
				TestUtil.Log(status,"Enter Currency in From Field  : "+FromCurrency +" failed");
				return false;
			}
			
			TestUtil.waitForElement(driver, fromdrp_locator1);
			Thread.sleep(1000);
			status=TestUtil.ClickElement(driver, fromdrp_locator1);		
			if(status) {
				TestUtil.Log(true,"Click on Drop DownValue "+FromCurrency+" Passed");
			}else {
				TestUtil.Log(false,"Click on Drop Down Value "+FromCurrency+ "failed");
			}
			
			TestUtil.waitForElement(driver, tocurrrency_locator);
			Thread.sleep(1000);
			status=TestUtil.ClickElement(driver, tocurrrency_locator);		
			if(status) {
				TestUtil.Log(true,"Click on To Currency Field Passed");
			}else {
				TestUtil.Log(false,"Click on To Currency Field failed");
			}
			
			Thread.sleep(3000);
			By todrp_locator1=By.xpath("//*[(contains(@class,'converterform-dropdown__option') or contains(@class,'ListboxOption')) and contains(.,'"+ToCurrency+"')]");
			TestUtil.waitForElement(driver, tocurrrency_locator);
			status=TestUtil.EnterText(driver, tocurrrency_locator, ToCurrency);
			if(status){
				TestUtil.Log(status,"Entered Currency in To Field  : "+ToCurrency);
			}else{
				TestUtil.Log(status,"Enter Currency in To Field  : "+ToCurrency +" failed");
				return false;
			}
			
			TestUtil.waitForElement(driver, todrp_locator1);
			Thread.sleep(1000);
			status=TestUtil.ClickElement(driver, todrp_locator1);		
			if(status) {
				TestUtil.Log(true,"Click on Drop DownValue "+ToCurrency+" Passed");
			}else {
				TestUtil.Log(false,"Click on Drop Down Value "+ToCurrency+ "failed");
			}
			
			TestUtil.waitForElement(driver, convert_btn);
			Thread.sleep(1000);
			status=TestUtil.ClickElement(driver, convert_btn);		
			if(status) {
				TestUtil.Log(true,"Click on Convert Button Passed");
			}else {
				TestUtil.Log(false,"Click on Convert Button failed");
			}
			
			Thread.sleep(1500);
			TestUtil.waitForElement_visibilityOfElementLocated(driver, By.xpath("//p[contains(@class,'result__BigRate')]"));
			String convertedRate=TestUtil.GetText(driver, By.xpath("//p[contains(@class,'result__BigRate')]"));
			if(convertedRate.length()==0){
				TestUtil.Log(false, "Unable to Capture the Converted Rate");
			}else{
				TestUtil.Log(true, " Captured the Converted Rate :" +convertedRate);
			}

		}
		catch(Exception e){
			return false;
		}
		return true;
	}
	
}
	


