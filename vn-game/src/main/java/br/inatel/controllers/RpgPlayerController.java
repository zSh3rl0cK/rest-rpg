package br.inatel.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RpgPlayerController {

    @GetMapping("/player")
    public String player() {
        return "player funcional";
    }
}
