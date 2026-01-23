package br.inatel.Items.Weapons.Swords;

import br.inatel.Items.Items;

public abstract class Swords extends Items {

    protected float baseDamage;

    public float calculateDamage(float strength, float vigor) {
        return baseDamage + (strength * 2) + (vigor * 0.5f);
    }
}
