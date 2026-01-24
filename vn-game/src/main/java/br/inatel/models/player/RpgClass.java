package br.inatel.models.player;

import br.inatel.models.LivingBeing;
import br.inatel.models.Items.Items;
import br.inatel.models.player.attributes.Attributes;

import java.util.HashMap;

public abstract class RpgClass extends LivingBeing {
    protected int level;
    protected float expPoints;
    protected int hp;
    protected int mp;

    protected Attributes attributes;
    protected HashMap<Integer, Items> inventory;  // Amount x Item

    protected float expToLevelup; // TODO: mover para config

    public RpgClass(int hp, int mp, int initialAttributePoints) {
        this.level = 1;
        this.hp = hp;
        this.mp = mp;
        this.expPoints = 0;
        this.attributes = new Attributes(initialAttributePoints);
        this.inventory = new HashMap<>();
    }

    public void addExperience(float exp) {
        expPoints += exp;

        if (expPoints >= expToLevelup) {
            expPoints = expPoints - expToLevelup;
            level++;
            levelUp();
        }
    }

    public void levelUp() {
        this.hp += 10;
        this.mp += 10;
        this.attributes.gainPoint();
    }

    public void addNewInventoryItem(Items item, int amount) {
        if (inventory.size() < 5) {
            inventory.put(amount, item);
        }
        // TODO: exceção de inventário cheio
    }

    public int getLevel() {
        return level;
    }

    public int getHp() {
        return hp;
    }

    public int getMp() {
        return mp;
    }

    public Attributes getAttributes() {
        return attributes;
    }
}
