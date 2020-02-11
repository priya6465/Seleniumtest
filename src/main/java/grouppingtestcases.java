

import org.testng.annotations.Test;

public class grouppingtestcases {
	@Test(priority=1,groups="loginpagetest")
	public void testcase1(){
		System.out.println("testcase one");
		}
	
	@Test(priority=2,groups="loginpagetest")
	public void testcase2(){
		System.out.println("testcase two");
	}
	
	@Test(priority=3,groups="loginpagetest")
    public void testcase3(){
		System.out.println("testcase three");
	}
	
	@Test(priority=4,groups="homepagetest")
	public void testcase4(){
		System.out.println("testcase four");
	}
	@Test(priority=5,groups="homepagetest")
	public void testcase5(){
		System.out.println("testcase five");
	}
}


