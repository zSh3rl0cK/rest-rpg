package br.inatel.Spells;

public abstract class Spells {

    protected String name;
    protected int mpCost;
    protected float basePower;

    public Spells(String name, int mpCost, float basePower) {
        this.name = name;
        this.mpCost = mpCost;
        this.basePower = basePower;
    }

    public float calculateFinalPower(float staffMultiplier) {
        return basePower * staffMultiplier;
    }

    public void cast(float finalPower) {
        // Por enquanto apenas representação do efeito
        System.out.println(
                name + " foi conjurado com poder " + finalPower
        );
    }

    public String getName() {
        return name;
    }

    public int getMpCost() {
        return mpCost;
    }
}
