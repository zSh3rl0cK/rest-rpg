package br.inatel.models.Items.Weapons;

import br.inatel.models.Items.Items;

public abstract class Weapon extends Items {
    protected String name;
    protected float baseDamage;
    protected String description;

    public abstract void applyDamage();

    // ---------- Getters e Setters ---------------

    public float getBaseDamage() {
        return baseDamage;
    }

    public void setBaseDamage(float baseDamage) {
        this.baseDamage = baseDamage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
