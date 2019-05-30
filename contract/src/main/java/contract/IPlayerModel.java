package contract;

import java.util.ArrayList;

public interface IPlayerModel {

    public void buildArea(final IDimension dimension);

    public IArea getArea();

    public void addMobile(final IMobile mobile);

    public void removeMobile(final IMobile mobile);

    public ArrayList<IMobile> getMobiles();

    public IMobile getMobileByPlayer(int player);

    public void setMobilesHavesMoved();

    public Direction getDirection();

    public void setDirection(final Direction direction);

}

