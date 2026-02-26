package br.inatel.domain.Spells.Offensive.Hydro;

import br.inatel.domain.Spells.utils.OffensiveSpell;
import br.inatel.domain.Spells.utils.SpellType;
import br.inatel.domain.Spells.utils.Spells;
import br.inatel.domain.player.LivingBeing;
import br.inatel.exception.SpellException;

public class WaterSpout extends Spells implements OffensiveSpell {
    public WaterSpout(String name) {
        super(name, 6, SpellType.DAMAGE, 10);
    }


    @Override
    public void castSpell(Spells spell) {

    }

    @Override
    public void castOffensiveSpell(LivingBeing target) {
        try{
            target.setLife(target.getLife() - this.basePower);
        }catch (Exception e){
            throw new SpellException("Error casting offensive spell");
        }
    }
}
