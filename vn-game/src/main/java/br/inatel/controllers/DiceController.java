package br.inatel.controllers;

import br.inatel.models.dice.Dices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dice")
public class DiceController {
    @Autowired
    private Dices dice;

    @GetMapping("/roll")
    public String rollDice(@RequestParam(defaultValue = "none") int faces) {
        return "Dado puro: " + dice.rollSingleDice(faces);
    }
}