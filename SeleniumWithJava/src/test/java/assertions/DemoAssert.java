package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoAssert {

	@Test
	 public void DemoMethod() {
		Assert.assertEquals('A','B');
	}
	@Test
	 public void DemoMethod2() {
			Assert.assertEquals('A','A');
		}
	
	@Test
	 public void DemoMetho() {
		int a=5;
		int b=8;
			Assert.assertTrue(b>a);
		}
	@Test
	 public void DemoMethod3() {
			Assert.assertEquals(4, 4);
		}
	@Test
	 public void DemoMethod4() {
			Assert.assertEquals("Ram","Ram","Both Strings are equal");
		}
	@Test
	 public void DemoMethod50() {
			Assert.assertEquals("Ram","ram","Both Strings are not equal");
		}
	@Test
	 public void DemoMethod15() {
			Assert.assertTrue(false);
		}
	@Test
	 public void DemoMethod7() {
			Assert.assertTrue(true);
		}
	@Test
	 public void DemoMethod8() {
			Assert.assertFalse(false);
		}
	@Test
	 public void DemoMethod9() {
			Assert.assertFalse(true);
		}
}

