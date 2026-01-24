package br.inatel.models.player.classes;

import br.inatel.models.Spells.Spells;
import br.inatel.models.Items.Weapons.Staff.BaseStaff;
import br.inatel.models.Items.Weapons.Staff.Staffs;
import br.inatel.models.player.RpgClass;
import br.inatel.models.player.attributes.AttributeType;

import java.util.HashMap;

public class Mage extends RpgClass {
    private Staffs staffEquipped;
    private HashMap<String, Spells> spells;

    public Mage() {
        super(70, 120, 5); // HP baixo, MP alto, 5 pontos iniciais
        this.staffEquipped = new BaseStaff();
        this.spells = new HashMap<>();
    }

    public void learnSpell(Spells newSpell) {
        spells.put(newSpell.getName(), newSpell);
    }

    public float castSpell(String spellName) {
        Spells spell = spells.get(spellName);

        if (spell == null) {
            throw new IllegalStateException("Feitiço não aprendido.");
        }

        if (mp < spell.getManaCost()) {
            throw new IllegalStateException("MP insuficiente.");
        }

        float intelligence = attributes.get(AttributeType.INT);
        float presence = attributes.get(AttributeType.PRES);

        float rawPower = spell.calculateEffect(intelligence, presence);
        float finalPower = staffEquipped.applyModifier(rawPower, spell.getType());

        mp -= spell.getManaCost();

        System.out.println("Mago conjurou " + spellName + " causando " + finalPower + " de dano.");
        return finalPower;
    }

    public void equipNewStaff(Staffs newStaff) {
        this.staffEquipped = newStaff;
    }
}