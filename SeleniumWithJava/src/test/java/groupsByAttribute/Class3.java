package groupsByAttribute;

import org.testng.annotations.Test;

public class Class3 {

	
	@Test
	public void TestMethod7() {
		System.out.println("Demo 7 test method");
	}
	@Test
	public void TestMethod8() {
		System.out.println("Demo 8 test method");
}
	@Test (groups= {"Smoke"})
	public void TestMethod9() {
		System.out.println("Demo 9 test method");
}
}
