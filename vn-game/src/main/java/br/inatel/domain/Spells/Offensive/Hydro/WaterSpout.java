package br.inatel.services.Spells.Offensive.Hydro;

import br.inatel.services.Spells.SpellType;
import br.inatel.services.Spells.Spells;

public class WaterSpout extends Spells {


    public WaterSpout(String name) {
        super(name, 6, SpellType.DAMAGE, 10);
    }
}
