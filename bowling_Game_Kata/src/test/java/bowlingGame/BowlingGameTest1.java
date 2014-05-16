package bowlingGame;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BowlingGameTest1 {

	private Game1 g;

	@Before
	public void setUp() throws Exception {
		g = new Game1();
	}

	@Test
	public void testGutterGame() throws Exception {
		for (int i = 0; i < 20; i++) {
			g.roll(0);
		}
		assertEquals(0, g.score());
	}
}