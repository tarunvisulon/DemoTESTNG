package TestNG.TestNG;

import org.testng.annotations.DataProvider;

public class DataSupplier {
	

	@DataProvider
	public Object[][] TestLogindata()
	{
	Object[][] data= new Object[][] {{"tarun_VF" ,"admin@123"}, {"tarun_VF","admin@1234"}};
	
	return data	;
	}
	
	

}
