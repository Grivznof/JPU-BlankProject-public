package model.element;

class Nothing extends Factory{

    public Nothing(String name, boolean state, Permeability permeability){
        super(name, state, Permeability.BLOCKING);
    }
}

