package TestNG.DataProvider;

import org.testng.annotations.Test;

public class Test1 {
	

	@Test
	public void TC1_1()
	{
		System.out.println("TestCase1 >> threadCount" + Thread.currentThread().getId());
		
	}
	
	@Test
	public void TC1_2()
	{
		System.out.println("TestCase1 >> threadCount" + Thread.currentThread().getId());
		
	}
	
	
	@Test
	public void TC1_3()
	{
		System.out.println("TestCase1 >> threadCount" + Thread.currentThread().getId());
		
	}
	
	
	@Test
	public void TC1_4()
	{
		System.out.println("TestCase1 >> threadCount" + Thread.currentThread().getId());
		
	}

}
