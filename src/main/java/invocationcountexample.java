import org.testng.annotations.Test;

public class invocationcountexample {
	@Test(invocationCount=10)
	public void Logintest(){
		System.out.println("login test functionality");
	}
	

}

