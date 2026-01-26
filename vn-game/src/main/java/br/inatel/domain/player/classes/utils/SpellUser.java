package br.inatel.domain.player.classes.utils;

import br.inatel.domain.Spells.utils.Spells;

public interface SpellUser {
    public float castSpell(String spellname);
    public void learnSpell(Spells spell);
}
