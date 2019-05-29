package model;

import model.element.mobile.Player;

public class State {

    private boolean moving;
    private boolean pushable;
    private boolean blocking;
    private boolean diggy;
    private boolean explosable;
    private boolean falling;

    public State(boolean moving, boolean pushable, boolean blocking, boolean diggy, boolean explosable, boolean falling){
        this.moving = moving;
        this.pushable = pushable;
        this.blocking = blocking;
        this.diggy =  diggy;
        this.explosable = explosable;
        this.falling = falling;
    }

    public boolean isMoving() {
        return moving;
    }

    public boolean isPushable() {
        return pushable;
    }

    public boolean isBlocking() {
        return blocking;
    }

    public boolean isDiggy() {
        return diggy;
    }

    public boolean isExplosable() {
        return explosable;
    }

    public boolean isFalling() {
        return falling;
    }


}
