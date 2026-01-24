//import br.inatel.models.dice.Dices;
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
//
//public class DicesTest {
//    private final Dices dices = new Dices();
//
//    @Test
//    void testRollSingleDiceWithinRange() {
//        int faces = 20;
//        int roll = dices.rollSingleDice(faces);
//
//        assertTrue(roll >= 1 && roll <= faces);
//    }
//
//    @Test
//    void testDifficultySuccess() {
//        assertTrue(dices.testDifficulty(15, 10));
//    }
//
//    @Test
//    void testDifficultyFailure() {
//        assertFalse(dices.testDifficulty(5, 10));
//    }
//}