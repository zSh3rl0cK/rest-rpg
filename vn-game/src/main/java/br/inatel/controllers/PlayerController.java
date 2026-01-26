package br.inatel.controllers;

import br.inatel.domain.player.Player;
import br.inatel.models.CharacterRequest;
import br.inatel.models.PlayerRequest;
import br.inatel.services.player.PlayerService;
import br.inatel.domain.player.classes.utils.RpgClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/player")
public class PlayerController {
    @Autowired
    private PlayerService playerService;


    @PostMapping
    public Player createPlayer(@RequestBody PlayerRequest request) {
        return playerService.createPlayer(request.name(), request.password());
    }

    @PostMapping("/{playerId}/character")
    public RpgClass createCharacter( @RequestBody CharacterRequest request) {
        return playerService.createCharacter(request);
    }
}

