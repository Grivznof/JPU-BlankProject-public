package model;

import contract.IArea;
import model.Dimension;
import contract.IDimension;
import java.awt.Image;

public class Area {

    public Area(IDimension dimension) {

    }

    class Sky implements IArea {
        private String	IMAGE	= "ground.png";
        private final Dimension	dimension;
        private Image image;

        public Sky(final Dimension dimension) {
            this.dimension = dimension;
        }


        public Dimension getDimension() {
            return this.dimension;
        }


        public int getWidth() {
            return this.getDimension().getWidth();
        }


        public int getHeight() {
            return this.getDimension().getHeight();
        }


        public Image getImage() {
            return this.image;
        }
    }
}
