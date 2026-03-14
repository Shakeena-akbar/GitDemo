
import org.testng.annotations.Test;

public class PS1 extends PS {
	
	@Test
	public void testRun()
	{
		PS2 ps = new PS2(3);
		int a = 3;
		System.out.println(ps.increment());
		System.out.println(ps.decrement());
		doThis();
		System.out.println(ps.Multiplytwo());
	}
}
