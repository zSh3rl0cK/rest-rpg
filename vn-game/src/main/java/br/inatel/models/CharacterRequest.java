package br.inatel.models;

import java.util.Map;

public record CharacterRequest(
        String characterName,
        String rpgClass,
        Map<String, Integer> attributes
) {
}
