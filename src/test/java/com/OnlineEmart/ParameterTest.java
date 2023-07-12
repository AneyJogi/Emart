package com.OnlineEmart;

import org.testng.annotations.Test;

public class ParameterTest {

	@Test
	public void ParametersConfiguration()
	{
		String Browser = System.getProperty("browser");
		String Username=System.getProperty("username");
		String Password= System.getProperty("password");
		System.out.println(Browser);
		System.out.println(Username);
		System.out.println(Password);
    }
	
}
