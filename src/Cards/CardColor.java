package Cards;

import java.awt.*;

public enum CardColor {
    Red(Color.RED,2,3,6, 6, "Red"),Blue(Color.BLUE, 3, 8, 8, 8, "Blue"),Black(Color.BLACK, 1, 2, 3, 4,"Black"),Green(Color.GREEN, 2, 4, 7, 7, "Green"),CambridgeBlue(Color.CYAN, 1, 2, 3, 3, "CambridgeBlue"),
    Orange(Color.ORANGE, 1, 3, 5, 5, "Orange"),Yellow(Color.YELLOW, 2, 4, 6, 6, "Yellow"),Pink(Color.MAGENTA, 1, 2, 4, 4, "Pink"),Brown(new Color(160,82,45), 1, 2, 2, 2, "Brown")
    ,LightGreen(new Color(127,255,0), 1, 2, 2, 2, "LightGreen"),FullColor(Color.WHITE,0,0,0,0,"FullColor");

    Color trueColor;
    int layer1_rent;
    int layer2_rent;
    int layer3_rent;
    int layer4_rent;
    String color;


    CardColor(Color trueColor, int layer1_rent, int layer2_rent, int layer3_rent, int layer4_rent, String color) {
        this.trueColor = trueColor;
        this.layer1_rent = layer1_rent;
        this.layer2_rent = layer2_rent;
        this.layer3_rent = layer3_rent;
        this.layer4_rent = layer4_rent;
        this.color = color;
    }
}
