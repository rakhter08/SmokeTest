package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {
	
	@Test
	public void sum() {
		int a=10;
		int b=20;
		Assert.assertEquals(30,a+b);
	}
	@Test
	public void sub() {
		int a=10;
		int b=20;
		Assert.assertEquals(10,b-a);
	}
	@Test
	public void div() {
		int a=10;
		int b=20;
		Assert.assertEquals(2,b/a);
	}
	@Test
	public void multi() {
		int a=10;
		int b=20;
		Assert.assertEquals(200,a*b);
	}

}
