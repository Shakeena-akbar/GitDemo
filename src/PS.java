import org.testng.annotations.BeforeTest;

public class PS {
	
	public void doThis()
	{
		System.out.println("I am here");
	}
	
	@BeforeTest
	public void BT()
	{
		System.out.println("I am first");
		System.out.println("I am last");
		System.out.println("I am middle");
	}

}



