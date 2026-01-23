package br.inatel.Spells.Offensive.Pyro;

import br.inatel.Spells.SpellType;
import br.inatel.Spells.Spells;

public class PyroBlast extends Spells {
    public PyroBlast(String name) {
        super(name, 6, SpellType.DAMAGE, 10);
    }
}
