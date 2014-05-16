package bowlingGame;

public class Game2 {
	private int score = 0;
	
	//Roll a ball.
	 // @param pins		The number of pins knocked down
	public void roll(int pins) {
	score += pins;
	}
	// @return   The total score of the game. 
	public int score() {
	return score;
	}
		
}
