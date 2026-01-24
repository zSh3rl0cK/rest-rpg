package br.inatel.models.Items.Weapons.Spears;

import br.inatel.models.Items.Items;

public abstract class Spears extends Items {

    protected float baseDamage;
    protected float strScaling;
    protected float dexScaling;

    public float calculateDamage(int str, int dex) {
        return baseDamage + (str * strScaling) + (dex * dexScaling);
    }
}
