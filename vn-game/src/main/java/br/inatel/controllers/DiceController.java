package br.inatel.controllers;

import br.inatel.services.dice.DicesService;
import br.inatel.models.DiceResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dice")
public class DiceController {
    @Autowired
    private DicesService dice;

    @GetMapping("/roll")
    public DiceResult roll(@RequestParam(defaultValue = "20") int faces,
            @RequestParam(defaultValue = "1") int times,
            @RequestParam(required = false) Integer difficulty) {

        return dice.completeRoll(faces, times, difficulty);
    }

    @GetMapping("/single")
    public int rollSingle(@RequestParam(defaultValue = "20") int faces) {
        return dice.rollSingleDice(faces);
    }
}