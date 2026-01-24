package br.inatel.models.player.attributes;

import java.util.EnumMap;
import java.util.Map;

public class Attributes {

    private Map<AttributeType, Integer> attributes;
    private int availablePoints;

    public Attributes(int initialPoints) {
        this.availablePoints = initialPoints;
        attributes = new EnumMap<>(AttributeType.class);

        for (AttributeType type : AttributeType.values()) {
            attributes.put(type, 0);
        }
    }

    public void addPoint(AttributeType type) {
        if (availablePoints <= 0) {
            throw new IllegalStateException("Não há pontos disponíveis.");
        }

        attributes.put(type, attributes.get(type) + 1);
        availablePoints--;
    }

    public int get(AttributeType type) {
        return attributes.get(type);
    }

    public void gainPoint() {
        availablePoints++;
    }

    public int getAvailablePoints() {
        return availablePoints;
    }
}
