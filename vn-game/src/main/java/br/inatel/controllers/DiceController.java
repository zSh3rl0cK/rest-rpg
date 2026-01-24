package br.inatel.controllers;

import br.inatel.models.dice.Dices;
import br.inatel.service.Dice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dice")
public class DiceController {
    @Autowired
    private Dices dice;

    @GetMapping("/roll")
    public Dice rollDice(@RequestParam(defaultValue = "none") int faces) {
        return new Dice(faces, dice.rollSingleDice(faces));
    }
}