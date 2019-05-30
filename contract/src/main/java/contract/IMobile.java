package contract;



public interface IMobile {

    public Direction getDirection();

    public void setDirection(final Direction direction);

    public IPosition getPosition();

    public IDimension getDimension();

    public int getWidth();

    public int getHeight();

    //public Sprite getSprite();//

    void move();

    public void placeInArea(IArea area);

    void setPlayerModel(IPlayerModel playerModel);

    boolean isPlayer(int player);
}
