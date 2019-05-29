package model.element.motionless;

import model.element.Permeability;
import model.element.Sprite;

class Ground extends MotionlessElement {

    private static final Sprite SPRITE = new Sprite('G',"Ground.png");

    Ground() {
        super(SPRITE, Permeability.DESTROYABLE);
    }

    private static boolean isMoving;
    private static boolean isPushable;
    private static boolean isBlocking;
    private static boolean isDiggy;
    private static boolean isExplosable;
    private static boolean isFalling;

    static {
        isMoving = false;
        isPushable = false;
        isBlocking = false;
        isDiggy = true;
        isExplosable = false;
        isFalling = false;
    }
}