package model.element.mobile;

import model.element.Permeability;
import model.element.Sprite;

public class Monster extends MobileElements{

    private static final Sprite SPRITE = new Sprite('R',"Monster.png");

    Monster() {
        super(SPRITE, Permeability.BLOCKING);
    }
}
