package model.element;

import contract.Permeability;

class Exit extends Factory{

    public Exit(String name, boolean state, Permeability permeability){
        super(name, state, Permeability.BLOCKING);
    }
}
