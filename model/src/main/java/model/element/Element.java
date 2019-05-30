package model.element;

import contract.IArea;
import contract.IElement;
import contract.Permeability;

import java.awt.Image;

public abstract class Element implements IElement {

    private Sprite sprite;

    private Permeability permeability;

    public Element(final Sprite sprite, final Permeability permeability) {
        this.setSprite(sprite);
        this.setPermeability(permeability);
    }

    public Element(IArea area, Permeability permeability, Sprite sprite) {
    }

    public Sprite getSprite() {
        return this.sprite;
    }

    /**
     * Sets the sprite.
     *
     * @param sprite
     *            the new sprite
     */
    protected final void setSprite(final Sprite sprite) {
        this.sprite = sprite;
    }

    public final Permeability getPermeability() {
        return this.permeability;
    }

    /**
     * Sets the permeability.
     *
     * @param permeability
     *            the new permeability
     */
    public void setPermeability(final Permeability permeability) {
        this.permeability = permeability;
    }

    public final Image getImage() {
        return this.getSprite().getImage();
    }
}


