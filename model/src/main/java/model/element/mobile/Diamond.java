package model.element.mobile;

import model.element.Permeability;
import model.element.Sprite;

public class Diamond extends MobileElements{

    private static final Sprite SPRITE = new Sprite('D',"Diamond.png");

    Diamond() {
        super(SPRITE, Permeability.BLOCKING);
    }
}


