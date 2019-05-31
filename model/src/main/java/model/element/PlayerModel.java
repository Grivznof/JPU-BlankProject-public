package model.element;

import contract.*;
import model.Area;

import java.util.ArrayList;
import java.util.Observable;

public class PlayerModel extends Observable implements IPlayerModel {

    private Area area;
    private final ArrayList<IMobile> mobiles;


    public PlayerModel() {
        this.mobiles = new ArrayList<>();
    }

    public IArea getArea() {
        return (IArea) this.area;
    }

    public void buildArea(final IDimension dimension) {
        this.area = new Area(dimension);
    }

    public void addMobile(final IMobile mobile) {
        this.mobiles.add(mobile);
        mobile.setPlayerModel(this);
    }

    public void removeMobile(final IMobile mobile) {
        this.mobiles.remove(mobile);
    }

    public ArrayList<IMobile> getMobiles() {
        return this.mobiles;
    }

    public IMobile getMobileByPlayer(final int player) {
        for (final IMobile mobile : this.mobiles) {
            if (mobile.isPlayer(player)) {
                return mobile;
            }
        }
        return null;
    }

    public void setMobilesHavesMoved() {
        this.setChanged();
        this.notifyObservers();
    }



}

