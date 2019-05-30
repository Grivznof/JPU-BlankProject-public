package model.element;

import contract.Permeability;

class Ground extends Factory{

    public Ground(String name, boolean state, Permeability permeability){
        super(name, state, Permeability.BLOCKING);
    }
}