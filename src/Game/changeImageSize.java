package Game;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class changeImageSize {
	public void changeSize(String imageName, int newWidth, int newHeight) throws IOException {    	
	    String before = imageName;  // input the path of picture
	    String now = imageName;  // output the path of picture

        BufferedImage previousImages = ImageIO.read(new File(before));
        BufferedImage currentImage = new BufferedImage(newWidth, newHeight, previousImages.getType());

        // change size
        Graphics graphics = currentImage.createGraphics();
        graphics.drawImage(previousImages, 0, 0, newWidth, newHeight, null);
        graphics.dispose();
        ImageIO.write(currentImage, "jpg", new File(now));

    }
}
