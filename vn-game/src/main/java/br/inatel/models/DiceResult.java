package br.inatel.models;

import java.util.List;

public record DiceResult(
        List<Integer> rolls,
        int rollsTotal,
        Boolean success,
        Integer difficulty // Note: precisa ser integer para poder ser nulo
) { }
