import br.inatel.services.dice.DicesService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DicesTest {
    private final DicesService dices = new DicesService();

    @Test
    void singleRollTest(){
        int faces = 20;
        int roll = dices.rollSingleDice(faces);

        assertTrue(roll >= 1 && roll <= faces);
    }

    @Test
    void multiRollTest(){
        int faces = 20, times = 3;
        assertNotNull(dices.rollMultiDice(faces,times));
    }

    @Test
    void completeRollTest(){
        int faces = 20, times = 3;
    }
}