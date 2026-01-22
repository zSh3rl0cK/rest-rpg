package br.inatel.dice;

import java.util.Random;

public class Dices {

    private final Random random = new Random();

    public boolean rollDice(int quantity, int faces, int difficulty) {
        for (int i = 0; i < quantity; i++) {
            int roll = rollSingleDice(faces);
            if (testDifficulty(roll, difficulty)) {
                return true;
            }
        }
        return false;
    }

    public int rollSingleDice(int faces) {
        return random.nextInt(faces) + 1; // 1 até faces
    }

    public boolean testDifficulty(int roll, int difficulty) {
        return roll >= difficulty;
    }
}
