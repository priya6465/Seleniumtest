

import org.testng.annotations.Test;

public class testcasesequencecallyexacuted {
  
	@Test(priority=1)
	public void testcase1(){
		System.out.println("testcase one");
		}
	
	@Test(priority=2)
	public void testcase2(){
		System.out.println("testcase two");
	}
	
	@Test(priority=3)
    public void testcase3(){
		System.out.println("testcase three");
	}
	
	@Test(priority=4)
	public void testcase4(){
		System.out.println("testcase four");
	}

}
