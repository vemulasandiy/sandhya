package com;



import org.openqa.selenium.WebDriver;


import org.openqa.selenium.ie.InternetExplorerDriver;


public class Identity
{
	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","C:/Users/vemka/Downloads/IEDriverServer_x64_3.14.0/IEDriverServer.exe" );
		WebDriver driver= new InternetExplorerDriver();
		 
	}
}
