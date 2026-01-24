package br.inatel.models.Spells;

public abstract class Spells {

    protected String name;
    protected int manaCost;
    protected SpellType type;
    protected float basePower;

    public Spells(String name, int manaCost, SpellType type, float basePower) {
        this.name = name;
        this.manaCost = manaCost;
        this.type = type;
        this.basePower = basePower;
    }

    public float calculateEffect(float intelligence, float presence) {

        return switch (type) {
            case DAMAGE -> basePower + (intelligence * 2);
            case HEAL, BUFF, DEBUFF -> basePower + (presence * 2) + intelligence;
            default -> basePower;
        };
    }

    public String getName() {
        return name;
    }

    public int getManaCost() {
        return manaCost;
    }

    public SpellType getType() {
        return type;
    }
}