package pkgTest;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgCore.Die;

public class DieTest {

	@Test
	public void TestDie() {

		for (int a = 0; a < 10000; a++) {
			Die d = new Die();

			assertTrue((int)d.getDieValue() <=6);
			assertTrue((int)d.getDieValue() >=1);
		}

	}

}
