package contract;

public interface IFactory {

    public String getName();

    public void setName(final String name);

    public boolean getState();

    public void setState(final boolean state);

    public Permeability getPermeability();

    public void setPermeability(final Permeability permeability);
}
