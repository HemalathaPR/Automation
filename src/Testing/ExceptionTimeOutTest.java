package Testing;

import org.testng.annotations.Test;

public class ExceptionTimeOutTest {
    /* @Test(invocationTimeOut=2,expectedExceptions = NumberFormatException.class)
     public void test() {
    	 int i=1;
    	 while(i==1) {
    	System.out.println(i);	 
    	 }
     }*/
	@Test(expectedExceptions = NumberFormatException.class)
	public void test() {
		String v ="100a";
		Integer.parseInt(v);
	}
}
