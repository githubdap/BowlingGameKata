package bowling_Game_Kata;

public class Game {
	 
    // 10 rolls 2 throws + 1 for last
    private int rolls[] = new int[21];

    // now you roll
    private int currentRoll = 0;

    //Roll a ball.
    // @param pins	The number of pins knocked down
    public void roll(int pins) {
        // put numbers to list of rolls
        rolls[currentRoll++] = pins;
    }

    // @return   The total score of the game. 
    public int score() {
        int score = 0;
        int frameIndex = 0;
        // score in set of rolls
        for (int frame = 0; frame < 10; frame++) {
            if (isStrike(frameIndex)){
                score += 10 + rolls[frameIndex + 1] + rolls[frameIndex + 2];
                frameIndex++;
            }
            else if (isSpare(frameIndex)) {
                score += 10 + rolls[frameIndex + 2];
                frameIndex += 2;
            } else {
                //Player done less then 10 points
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
    
    // @return true  when 10 points is reached in single roll	
    private boolean isStrike(int frameIndex) {
        return rolls[frameIndex] == 10;
    }

}
