package model.element;

import contract.Permeability;

public class Diamond extends Factory{

    public Diamond(String name, boolean state, Permeability permeability){
        super(name, state, Permeability.BLOCKING);
    }
}


