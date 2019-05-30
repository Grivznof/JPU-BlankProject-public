package model.element;

import contract.Permeability;

public class Factory {

    private String name;
    private boolean state;
    private Permeability permeability;

    public Factory(final String name, final boolean state, final Permeability permeability) {
        this.setName(name);
        this.setState(state);
        this.setPermeability(permeability);
    }

    public String getName() {return this.name;}

    private void setName(final String name) {
        this.name = (name);
    }

    public boolean getState() {return this.state;}

    private void setState(final boolean state){
        this.state = (state);
    }

    public Permeability getPermeability() {return this.permeability;}
    
    private void setPermeability(final Permeability permeability){
        this.permeability = (permeability);

    }
}



