package br.inatel.domain.Spells.Offensive.Pyro;

import br.inatel.domain.Spells.utils.OffensiveSpell;
import br.inatel.domain.Spells.utils.SpellType;
import br.inatel.domain.Spells.utils.Spells;
import br.inatel.domain.player.LivingBeing;
import br.inatel.exception.SpellException;

public class PyroBlast extends Spells implements OffensiveSpell {
    public PyroBlast(String name) {
        super(name, 6, SpellType.DAMAGE, 10);
    }

    //todo: implementar as características específicas

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
