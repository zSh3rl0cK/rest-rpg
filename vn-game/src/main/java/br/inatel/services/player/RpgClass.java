package br.inatel.services.player;

import br.inatel.exception.FullInventoryException;
import br.inatel.services.LivingBeing;
import br.inatel.services.Items.Items;
import br.inatel.services.player.attributes.Attributes;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@Getter
@Setter
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

    public void addNewInventoryItem(Items item, int amount) throws FullInventoryException {
        if (inventory.size() < 5) {
            inventory.put(amount, item);
        }
        else {
            throw new FullInventoryException("Your inventory is full!");
        }
    }
}
