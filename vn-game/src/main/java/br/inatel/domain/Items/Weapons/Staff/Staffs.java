package br.inatel.services.Items.Weapons.Staff;

import br.inatel.services.Items.Items;
import br.inatel.services.Spells.SpellType;

public abstract class Staffs extends Items {
    protected float damageMultiplier;
    protected float supportMultiplier;

    public float applyModifier(float value, SpellType type) {
        return switch (type) {
            case DAMAGE -> value * damageMultiplier;
            case HEAL, BUFF, DEBUFF -> value * supportMultiplier;
            default -> value;
        };
    }
}
