package br.inatel.services.player.classes.utils;

import br.inatel.services.Spells.Spells;

public interface SpellUser {
    public float castSpell(String spellname);
    public void learnSpell(Spells spell);
}
