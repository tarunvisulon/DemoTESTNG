package TestNG.DataProvider;

import org.testng.annotations.Test;

public class Test4 {
	
	

	@Test
	public void TC4_1()
	{
		System.out.println("TestCase4 >> threadCount" + Thread.currentThread().getId());
		
	}
	
	@Test
	public void TC4_2()
	{
		System.out.println("TestCase4 >> threadCount" + Thread.currentThread().getId());
		
	}
	
	
	@Test
	public void TC4_3()
	{
		System.out.println("TestCase4 >> threadCount" + Thread.currentThread().getId());
		
	}
	
	
	@Test
	public void TC4_4()
	{
		System.out.println("TestCase4 >> threadCount" + Thread.currentThread().getId());
		
	}

}
