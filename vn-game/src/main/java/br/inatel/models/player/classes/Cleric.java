package br.inatel.models.player.classes;

import br.inatel.models.Items.Weapons.Staff.BaseStaff;
import br.inatel.models.Items.Weapons.Staff.Staffs;
import br.inatel.models.Spells.Spells;
import br.inatel.models.player.RpgClass;
import br.inatel.models.player.attributes.AttributeType;
import br.inatel.models.player.classes.utils.SpellUser;

import java.util.HashMap;

public class Cleric extends RpgClass implements SpellUser {
    private Staffs staffEquipped;
    private HashMap<String, Spells> spells;

    public Cleric() {
        super(90, 110, 5);
        this.staffEquipped = new BaseStaff();
        this.spells = new HashMap<>();
    }

    @Override
    public void learnSpell(Spells spell) {
        spells.put(spell.getName(), spell);
    }

    @Override
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

        float rawEffect = spell.calculateEffect(intelligence, presence);
        float finalEffect = staffEquipped.applyModifier(rawEffect, spell.getType());

        mp -= spell.getManaCost();

        return finalEffect;
    }

    public void equipStaff(Staffs newStaff) {
        this.staffEquipped = newStaff;
    }
}