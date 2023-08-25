package groupsByAttribute;

import org.testng.annotations.Test;

public class Class2 {

	@Test
	public void TestMethod4() {
		System.out.println("Demo 4 test method");
	}
	@Test(groups= {"Smoke"})
	public void TestMethod5() {
		System.out.println("Demo 5 test method");
}
	@Test
	public void TestMethod6() {
		System.out.println("Demo 6 test method");
}
}
