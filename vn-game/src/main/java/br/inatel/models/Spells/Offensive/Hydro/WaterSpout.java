package br.inatel.models.Spells.Offensive.Hydro;

import br.inatel.models.Spells.SpellType;
import br.inatel.models.Spells.Spells;

public class WaterSpout extends Spells {


    public WaterSpout(String name) {
        super(name, 6, SpellType.DAMAGE, 10);
    }
}
