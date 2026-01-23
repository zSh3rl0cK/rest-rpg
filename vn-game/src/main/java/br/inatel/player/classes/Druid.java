package br.inatel.player.classes;

import br.inatel.Items.Weapons.Spears.BaseSpear;
import br.inatel.Items.Weapons.Spears.Spears;
import br.inatel.player.RpgClass;
import br.inatel.player.attributes.AttributeType;

public class Druid extends RpgClass {

    private Spears spearEquipped;
    private DruidForm currentForm;

    public Druid() {
        super(85, 100, 5); // 5 pontos iniciais
        this.spearEquipped = new BaseSpear();
        this.currentForm = DruidForm.HUMAN;
    }

    public float attackWithSpear() {
        float damage = spearEquipped.calculateDamage(
                attributes.get(AttributeType.STR),
                attributes.get(AttributeType.DEX)
        );

        System.out.println("Druida atacou com lança causando " + damage + " de dano.");
        return damage;
    }

    public void transform(DruidForm newForm) {
        this.currentForm = newForm;
        System.out.println("Druida se transformou em: " + newForm);
    }
}
