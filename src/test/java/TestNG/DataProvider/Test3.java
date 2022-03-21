package TestNG.DataProvider;

import org.testng.annotations.Test;

public class Test3 {
	
	
	
	@Test
	public void TC3_1()
	{
		System.out.println("TestCase3 >> threadCount" + Thread.currentThread());
		
	}
	
	@Test
	public void TC3_2()
	{
		System.out.println("TestCase3 >> threadCount" + Thread.currentThread().getId());
		
	}
	
	
	@Test
	public void TC3_3()
	{
		System.out.println("TestCase3 >> threadCount" + Thread.currentThread().getId());
		
	}
	
	
	@Test
	public void TC3_4()
	{
		System.out.println("TestCase3 >> threadCount" + Thread.currentThread().getId());
		
	}

}
