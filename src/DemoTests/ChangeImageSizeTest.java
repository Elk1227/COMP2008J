package DemoTests;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ChangeImageSizeTest {
	private Game.changeImageSize changeImageSize;

    @BeforeEach
    public void setUp() {
        changeImageSize = new Game.changeImageSize();
    }

    @Test
    public void testChangeSize() throws IOException {
        //Randomly select a picture of a card to change
        String imagePath = "resources/money/1.jpg";
        int newWidth = 800;
        int newHeight = 600;
        changeImageSize.changeSize(imagePath, newWidth, newHeight);
        String nowImagePath = imagePath;
        BufferedImage currentImage = ImageIO.read(new File(nowImagePath));
        Assertions.assertEquals(newWidth, currentImage.getWidth());
        Assertions.assertEquals(newHeight, currentImage.getHeight());
        System.out.println("Successful test");
    }

}
