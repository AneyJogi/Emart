package com.OnlineEmart;

import org.testng.annotations.Test;

public class ExampleTest {

	@Test(groups = "smoke")
	public void data1() {
		System.out.println("testyantra.com");
	}
	@Test(groups = "regression")
	public void data2() {
		System.out.println("regression 1 executed");
	}
}
