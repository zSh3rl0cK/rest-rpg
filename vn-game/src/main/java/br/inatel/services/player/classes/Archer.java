package br.inatel.models.player.classes;

import br.inatel.models.Items.Weapons.Archs.Archs;
import br.inatel.models.Items.Weapons.Archs.BaseArch;
import br.inatel.models.player.RpgClass;

public class Archer extends RpgClass {

    private Archs archEquipped;

    public Archer() {
        super(90, 60, 5);
        this.archEquipped = new BaseArch();
    }

    public void equipNewArch(Archs newArch) {
        this.archEquipped = newArch;
    }

    public float attack() {
        float damage = archEquipped.calculateFinalDamage();

        System.out.println(
                "O arqueiro disparou uma flecha causando " + damage + " de dano."
        );

        return damage;
    }
}
