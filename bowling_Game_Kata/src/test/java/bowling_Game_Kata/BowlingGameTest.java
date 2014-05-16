package bowling_Game_Kata;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BowlingGameTest {

    private Game g;

    @Before
    public void setUp() throws Exception {
        g = new Game();
    }
    
    //Miss twenty time in row 
    @Test
    public void testGutterGame() throws Exception {

        rollMany(20, 0);

        assertEquals(0, g.score());
    }

    // Hit one pin twenty time in row
    @Test
    public void testAllOnce() throws Exception {
        rollMany(20, 1);
        assertEquals(20, g.score());
    }
    //Get 10 points just ones
    @Test
    public void testOneStrike() throws Exception {
        rollStrike();
        g.roll(3);
        g.roll(4);
        rollMany(16, 0);
        assertEquals(24, g.score());
    }

    //Roll Spare just ones 
    @Test
    public void testOneSpare() {
        rollSpare();
        g.roll(3);
        rollMany(17, 0);
        assertEquals(16, g.score());
    }
    //Get 10 points every time
    @Test
    public void testPerfectGame() throws Exception {
        rollMany(12, 10);
        assertEquals(300, g.score());
    }

    
    // Roll as many times as needed
    private void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++) {
            g.roll(pins);
        }
    }
    //Get 10 points in two rolls
    private void rollSpare() {
        g.roll(5);
        g.roll(5);

    }
    //Get 10 points in one roll
    private void rollStrike() {
        g.roll(10);
    }

}
