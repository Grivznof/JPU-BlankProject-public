package model;

import javax.imageio.ImageIO;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

public class Area {

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
