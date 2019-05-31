package model.element;

import contract.IArea;
import contract.Permeability;

public abstract class Element{

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

    private void setSprite(final Sprite sprite) {
        this.sprite = sprite;
    }

    public final Permeability getPermeability() {
        return this.permeability;
    }

    public void setPermeability(final Permeability permeability) {
        this.permeability = permeability;
    }

  }



