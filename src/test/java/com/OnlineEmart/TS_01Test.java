package com.OnlineEmart;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TS_01Test {
	
	@Test(groups="smoke")
	public void sampleTest1()
	{
		System.out.println("test script 01");
	}
	
	@Test
	public void sampleTest2()
	{
		Assert.fail();
		System.out.println("test script 02");
		
	}

}
