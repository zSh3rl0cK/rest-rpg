package br.inatel.models.player.classes;

import br.inatel.models.Items.Weapons.Daggers.BaseDagger;
import br.inatel.models.Items.Weapons.Daggers.Daggers;
import br.inatel.models.player.RpgClass;
import br.inatel.models.player.attributes.AttributeType;

public class Rogue extends RpgClass {

    private Daggers daggerEquipped;
    // private HashMap<String, RogueSpell> spells;

    public Rogue() {
        super(85, 60, 5);
        this.daggerEquipped = new BaseDagger();
    }

    public float attack() {
        float dex = attributes.get(AttributeType.DEX);
        float damage = daggerEquipped.calculateDamage(dex);

        System.out.println("Rogue atacou com adaga causando " + damage + " de dano.");

        return damage;
    }

    /*

    public void learnSpell(RogueSpell spell) {
        spells.put(spell.getName(), spell);
    }

    public float castSpell(String spellName) {
        RogueSpell spell = spells.get(spellName);

        if (spell == null) {
            throw new IllegalStateException("Habilidade não aprendida.");
        }

        if (mp < spell.getManaCost()) {
            throw new IllegalStateException("MP insuficiente.");
        }

        float dex = attributes.get(AttributeType.DEX);
        float pres = attributes.get(AttributeType.PRES);

        float effect = spell.calculateEffect(dex, pres);

        mp -= spell.getManaCost();

        return effect;
    }
     */

    public void equipDagger(Daggers newDagger) {
        this.daggerEquipped = newDagger;
    }
}
