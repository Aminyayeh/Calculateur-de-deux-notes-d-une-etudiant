import amin.Mainnn;
import junit.framework.TestCase;

public class CalculateurTest extends TestCase {

	public void testCaclculerMoyenne() {
		Mainnn main = new Mainnn();
		
		assertEquals(10,(long) main.calculerMoyenne(10, 10));
	}
}
