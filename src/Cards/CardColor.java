package Cards;

import java.awt.*;

public enum CardColor {
    Red(2,3,6, 3 ),Blue(3, 8, 2 ),Black(1, 2, 3, 4,4),Green( 2, 4, 7, 3),CambridgeBlue( 1, 2, 3, 3),
    Orange(1, 3, 5, 3),Yellow(2, 4, 6, 3),Pink( 1, 2, 4, 3),Brown(1, 2, 2 )
    ,LightGreen(1, 2, 2 ),wild;
    int layer1_rent;
    int layer2_rent;
    int layer3_rent;
    int layer4_rent;
    int fullLayer;



    private CardColor() {
	}

	CardColor(int layer1_rent, int layer2_rent,  int fullLayer) {
        this.layer1_rent = layer1_rent;
        this.layer2_rent = layer2_rent;
        this.fullLayer = fullLayer;
    }

    CardColor(int layer1_rent, int layer2_rent, int layer3_rent, int fullLayer) {
        this.layer1_rent = layer1_rent;
        this.layer2_rent = layer2_rent;
        this.layer3_rent = layer3_rent;
        this.fullLayer = fullLayer;
    }


     CardColor(int layer1_rent, int layer2_rent, int layer3_rent, int layer4_rent, int fullLayer) {
        this.layer1_rent = layer1_rent;
        this.layer2_rent = layer2_rent;
        this.layer3_rent = layer3_rent;
        this.layer4_rent = layer4_rent;
        this.fullLayer = fullLayer;
    }


    public int getLayer1_rent() {
        return layer1_rent;
    }

    public int getLayer2_rent() {
        return layer2_rent;
    }

    public int getLayer3_rent() {
        return layer3_rent;
    }

    public int getLayer4_rent() {
        return layer4_rent;
    }
    public int getFullLayer() {
        return fullLayer;
    }
    public void setLayer1_rent(int layer1_rent) {
        this.layer1_rent = layer1_rent;
    }

    public void setLayer2_rent(int layer2_rent) {
        this.layer2_rent = layer2_rent;
    }

    public void setLayer3_rent(int layer3_rent) {
        this.layer3_rent = layer3_rent;
    }

    public void setLayer4_rent(int layer4_rent) {
        this.layer4_rent = layer4_rent;
    }

    public void setFullLayer(int fullLayer) {
        this.fullLayer = fullLayer;
    }
}
