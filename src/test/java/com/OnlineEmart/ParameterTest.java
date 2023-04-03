package com.OnlineEmart;

import org.testng.annotations.Test;

public class ParameterTest {
	
	@Test
	public void ParametersConfiguration()
	{
		String b = System.getProperty("browser");
		System.getProperty("username");
		System.getProperty("password");
		System.out.println(b);
    }


}
