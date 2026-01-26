package br.inatel.domain.player;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class LivingBeing {
    protected String id;
    protected String name;
    protected int age;
    protected String gender;
    protected String description;

}
