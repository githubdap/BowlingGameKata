package bowlingGame;

public class Game3 {
	
	private int rolls[] = new int[21];
	private int currentRoll = 0;
	
	//Roll a ball.
	// @param pins		The number of pins knocked down
	public void roll(int pins) {
		rolls[currentRoll++] = pins;
	}
	
	// @return   The total score of the game. 
	public int score() {
		int score = 0;
		int frameIndex = 0;
		
		for (int frame = 0; frame < 10; frame++) {
			if (isSpare(frameIndex)){
				score += 10 + rolls[frameIndex + 2];
				frameIndex += 2;
			} else {
				score += rolls[frameIndex] + rolls[frameIndex + 1];
				frameIndex += 2;
			}
		}
		return score;
	}
	
	// @return true  when 10 points is reached in two rolls
	private boolean isSpare(int frameIndex) {
		return rolls[frameIndex] + rolls[frameIndex + 1] == 10;
	}
}
