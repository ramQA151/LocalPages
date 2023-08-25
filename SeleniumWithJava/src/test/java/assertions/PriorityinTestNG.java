package assertions;

import org.testng.annotations.Test;

public class PriorityinTestNG {

	@Test(priority =1)
	public void Register() {
		System.out.println("Please Register and fill the mandatory fields");
	}
	@Test (priority =0)
	public void Login() {
		System.out.println("Please login with valid credentials");
	}
	@Test (priority =2)
	public void HomePage() {
		System.out.println("You have successfully landed on Homae page");
	}

}
