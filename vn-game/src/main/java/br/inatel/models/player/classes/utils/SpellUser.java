package br.inatel.models.player.classes.utils;

import br.inatel.models.Spells.Spells;

public interface SpellUser {
    public float castSpell(String spellname);
    public void learnSpell(Spells spell);
}
