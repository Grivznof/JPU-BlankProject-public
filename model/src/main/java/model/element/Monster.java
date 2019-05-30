package model.element;

import contract.Permeability;

public class Monster extends Factory{

    public Monster(String name, boolean state, Permeability permeability){
        super(name, state, Permeability.BLOCKING);
    }
}
