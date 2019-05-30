package model.element;

import contract.Permeability;

class Wall extends Factory{

    public Wall(String name, boolean state, Permeability permeability){
        super(name, state, Permeability.BLOCKING);
    }
}
