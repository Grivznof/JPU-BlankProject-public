package model.element.mobile;

import model.element.Permeability;
import model.element.Sprite;

public class Rock extends MobileElements {

    private static final Sprite SPRITE = new Sprite('R',"Rock.png");

    Rock() {
        super(SPRITE, Permeability.BLOCKING);
    }
}



