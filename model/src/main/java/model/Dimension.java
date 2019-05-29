package model;

import contract.IDimension;

public class Dimension implements IDimension {

    private int	width;
    private int	height;

    private Dimension(final int width, final int height) {
        this.width = width;
        this.height = height;
    }

    public Dimension(final Dimension dimension) {
        this(dimension.getWidth(), dimension.getHeight());
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(final int width) {
        this.width = width;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(final int height) {
        this.height = height;
    }

}


