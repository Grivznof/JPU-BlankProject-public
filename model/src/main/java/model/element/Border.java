package model.element;

import contract.Permeability;

class Border extends Factory{

        public Border(String name, boolean state, Permeability permeability){
            super(name, state, Permeability.BLOCKING);
        }
}
