package br.inatel.models.Spells.Offensive.Pyro;

import br.inatel.models.Spells.SpellType;
import br.inatel.models.Spells.Spells;

public class PyroBlast extends Spells {
    public PyroBlast(String name) {
        super(name, 6, SpellType.DAMAGE, 10);
    }
}
