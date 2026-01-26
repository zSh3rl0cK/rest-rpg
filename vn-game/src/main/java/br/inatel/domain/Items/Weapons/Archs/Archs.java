package br.inatel.services.Items.Weapons.Archs;

import br.inatel.services.Items.Items;

public abstract class Archs extends Items {

    protected float baseDamage;
    protected float damageMultiplier;

    public float calculateFinalDamage() {
        return baseDamage * damageMultiplier;
    }

    public float getBaseDamage() {
        return baseDamage;
    }

    public float getDamageMultiplier() {
        return damageMultiplier;
    }
}
