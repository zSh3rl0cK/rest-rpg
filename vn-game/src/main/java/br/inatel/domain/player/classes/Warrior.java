package br.inatel.domain.player.classes;

import br.inatel.domain.Items.Weapons.Swords.BaseSword;
import br.inatel.domain.Items.Weapons.Swords.Swords;
import br.inatel.domain.player.attributes.AttributeType;
import br.inatel.domain.player.classes.utils.RpgClass;

public class Warrior extends RpgClass {

    private Swords swordEquipped;

    public Warrior() {
        super(120, 30, 5); // HP alto, MP baixo
        this.swordEquipped = new BaseSword();
    }

    public float attack() {
        float strength = attributes.get(AttributeType.STR);
        float vigor = attributes.get(AttributeType.VIG);

        float damage = swordEquipped.calculateDamage(strength, vigor);

        System.out.println("Guerreiro atacou causando " + damage + " de dano.");
        return damage;
    }

    @Override
    public void levelUp() {
        super.levelUp();
        this.hp += attributes.get(AttributeType.VIG) * 2;
    }

    public void equipSword(Swords newSword) {
        this.swordEquipped = newSword;
    }
}
