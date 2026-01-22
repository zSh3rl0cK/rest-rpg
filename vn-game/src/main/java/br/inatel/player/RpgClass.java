package br.inatel.player;

import br.inatel.LivingBeing;
import br.inatel.Items.Items;

import java.util.HashMap;

public abstract class RpgClass extends LivingBeing {
    protected int level;
    protected float expPoints;
    protected int hp;
    protected int mp;
    protected HashMap<Integer, Items> inventory;  // Amount x Item

    protected float expToLevelup; // Todo: level hardcoded isso deverá ser uma variavel num arc config

    public RpgClass(int hp, int mp) {
        this.level = 1;
        this.hp = hp;
        this.mp = mp;
        this.expPoints = 0;
    }

    public void addExperience(float exp) {
        expPoints += exp;

        if (expPoints >= expToLevelup) {
            expPoints = expToLevelup - expPoints;
            level++;

            levelUp();
        }
    }

    // todo: os valores incrementados no level up devem ser uma variavel num arc de config (ta hardcoded)
    public void levelUp() {
        this.hp += 10;
        this.mp += 10;
    }

    public void addNewInventoryItem(Items item, int amount) {
        if (inventory.size() < 5) {
            this.inventory.put(amount, item);
        }

        // Todo: criar e exceção de inventario cheio e substituir o 5 por um valor em config de espaço inicial
    }

    // ---------- Getters e Setters ---------------

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }
}
