package br.inatel.models.Items.Weapons.Daggers;

import br.inatel.models.Items.Items;

public abstract class Daggers extends Items {

    protected float baseDamage;
    protected float dexScaling;
    protected float critChance;

    public float calculateDamage(float dexterity) {
        return baseDamage + (dexterity * dexScaling);
    }

    public float getCritChance() {
        return critChance;
    }
}
