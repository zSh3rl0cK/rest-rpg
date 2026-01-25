package br.inatel.services.Spells.Offensive.Pyro;

import br.inatel.services.Spells.SpellType;
import br.inatel.services.Spells.Spells;

public class PyroBlast extends Spells {
    public PyroBlast(String name) {
        super(name, 6, SpellType.DAMAGE, 10);
    }
}
