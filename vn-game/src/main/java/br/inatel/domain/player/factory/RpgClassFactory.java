package br.inatel.domain.player.factory;

import br.inatel.domain.player.classes.*;
import br.inatel.domain.player.classes.utils.RpgClass;

public class RpgClassFactory {
    public static RpgClass create(RpgClassType type) {
        return switch (type) {
            case MAGE -> new Mage();
            case WARRIOR -> new Warrior();
            case ROGUE -> new Rogue();
            case CLERIC -> new Cleric();
            case DRUID -> new Druid();
            case ARCHER -> new Archer();
        };
    }
}
