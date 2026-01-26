package br.inatel.services.player;

import br.inatel.domain.player.Player;
import br.inatel.models.CharacterRequest;
import br.inatel.domain.player.classes.utils.RpgClass;
import br.inatel.domain.player.factory.RpgClassFactory;
import br.inatel.domain.player.factory.RpgClassType;
import org.springframework.stereotype.Service;

@Service
public class PlayerService {
    public Player createPlayer(String name, String password) {

        Player player = new Player();
        player.setName(name);
        player.setPassword(password);

        return player;
    }

    public RpgClass createCharacter(CharacterRequest request) {

        RpgClassType classType =
                RpgClassType.valueOf(request.rpgClass().toUpperCase());

        RpgClass character = RpgClassFactory.create(classType);

        character.setName(request.characterName());

        // distributeAttributes(character, request.attributes());

        return character;
    }

    //
}
