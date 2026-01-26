package br.inatel.domain.player;

import br.inatel.domain.player.classes.utils.RpgClass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Player {
    private RpgClass character;
    private String name;
    private String password;
}
