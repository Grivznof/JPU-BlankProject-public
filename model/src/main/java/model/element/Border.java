package model.element;

class Border extends Factory{

        public Border(String name, boolean state, Permeability permeability){
            super(name, state, Permeability.BLOCKING);
        }
}
