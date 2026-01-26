package br.inatel.domain.Spells.Offensive.Hydro;

import br.inatel.domain.Spells.utils.SpellType;
import br.inatel.domain.Spells.utils.Spells;

public class WaterSpout extends Spells {


    public WaterSpout(String name) {
        super(name, 6, SpellType.DAMAGE, 10);
    }
}
