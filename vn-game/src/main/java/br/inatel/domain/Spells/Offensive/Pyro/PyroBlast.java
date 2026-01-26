package br.inatel.domain.Spells.Offensive.Pyro;

import br.inatel.domain.Spells.utils.SpellType;
import br.inatel.domain.Spells.utils.Spells;

public class PyroBlast extends Spells {
    public PyroBlast(String name) {
        super(name, 6, SpellType.DAMAGE, 10);
    }
}
