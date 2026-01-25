package br.inatel.services.dice;

import br.inatel.models.DiceResult;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

@Service
public class DicesService{

    private final Random random = new Random();

    public int rollSingleDice(int faces) {
        return random.nextInt(faces) + 1;
    }

    public List<Integer> rollMultiDice(int faces, int times) {
        return IntStream.range(0, times).map(i -> rollSingleDice(faces)).boxed().toList();
    }

    public DiceResult completeRoll(int faces, int times, Integer difficulty) {
        List<Integer> rolls = rollMultiDice(faces, times);

        int sum = rolls.stream().mapToInt(Integer::intValue).sum();

        Boolean success = (difficulty != null) ? sum >= difficulty : null;

        return new DiceResult(rolls, sum, success, difficulty);
    }
}