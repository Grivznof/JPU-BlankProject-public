package model.element.motionless;

public abstract class MotionlessElementsFactory {

    private static final Border border = new Border();

    private static final Wall wall = new Wall();

    private static final Ground ground = new Ground();

    private static final Exit exit = new Exit();

    private static final Explosion explosion = new Explosion();


    private static MotionlessElement[] motionlessElements = {
            border,
            wall,
            ground,
            exit,};

    public static MotionlessElement createBorder() { return border;}

    public static MotionlessElement createWall() { return wall;}

    public static MotionlessElement createGround() { return ground;}

    public static MotionlessElement createExit () { return exit;}

    public static MotionlessElement createExplosion () {return explosion; }




}

