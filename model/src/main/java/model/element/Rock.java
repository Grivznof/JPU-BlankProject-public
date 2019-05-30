package model.element;


import contract.Permeability;

public class Rock extends Factory{

    public Rock(String name, boolean state, Permeability permeability){
        super(name, state, Permeability.BLOCKING);
    }
}



