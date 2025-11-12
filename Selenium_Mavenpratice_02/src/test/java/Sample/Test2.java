package Sample;

import org.testng.annotations.Test;

public class Test2 {
	
	@Test
	public void CreateOrgTest() {
		
		String URL=System.getProperty("url");
		String BROWSER=System.getProperty("browser");//if we are not passing maven parameters default value also used
		String USERNAME=System.getProperty("username");
		String PASSWORD=System.getProperty("password");
		
//		String URL=System.getProperty("url","http://localhost:8888");
//		String BROWSER=System.getProperty("browser","chrome");//if we are not passing maven parameters default value also used
//		String USERNAME=System.getProperty("username","admin");
//		String PASSWORD=System.getProperty("password","admin");
		
		System.out.println(URL);
		System.out.println(BROWSER);
	    System.out.println(USERNAME);
	    System.out.println(PASSWORD);
		System.out.println("excute CreateOrg & verify");
	}
	
	
	@Test
	public void CreateOrgwithPhonenumberTest() {
		System.out.println("excute CreateOrgwithPhonenumber & verify");
	}
	
	

}
