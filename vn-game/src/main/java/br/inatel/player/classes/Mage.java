package br.inatel.player.classes;

import br.inatel.Spells.Spells;
import br.inatel.Items.Weapons.Staff.BaseStaff;
import br.inatel.Items.Weapons.Staff.Staffs;
import br.inatel.player.RpgClass;

import java.util.HashMap;

public class Mage extends RpgClass {
    private Staffs staffEquiped;
    private HashMap<String, Spells> spells = new HashMap<>(); // Every spell learned is avaible to use

    public Mage(int hp, int mp) {
        super(hp, mp);

        this.staffEquiped = new BaseStaff();
    }

    public void equipNewStaff(Staffs newstaff) {
        this.staffEquiped = newstaff;
    }

    public void addNewSpell(Spells newSpell){
        this.spells.put(newSpell.getName(), newSpell);
    }

    public void castSpell(Spells spell) {
        if(this.spells.containsKey(spell.getName())){
            spell.cast();
        }
    }
}