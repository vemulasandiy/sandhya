package com;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckingTitle
{
	public static void main(String[] args)
	{
		WebDriver driver= new FirefoxDriver();
		driver.get("http://www.google.com");
		
		
	String var	=driver.getTitle();
	if(var.equals("Google")){
		System.out.println("pass");
	}else{
		System.out.println("fail");
	}
	
		driver.close();
	}
}
 