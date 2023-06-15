package Model.Cards;

import java.awt.*;

public enum CardColor {
    Red(2,3,6, 3,Color.RED),Blue(3, 8, 2,Color.BLUE ),Black(1, 2, 3, 4,4,Color.BLACK),Green( 2, 4, 7, 3,Color.GREEN),CambridgeBlue( 1, 2, 3, 3,new Color(173,216,230)),
    Orange(1, 3, 5, 3,new Color(255,165,0)),Yellow(2, 4, 6, 3,Color.YELLOW),Pink( 1, 2, 4, 3,Color.PINK),Brown(1, 2, 2,new Color(145,102,64) )
    ,LightGreen(1, 2, 2,new Color(144,238,144) ),wild;
    int layer1_rent;
    int layer2_rent;
    int layer3_rent;
    int layer4_rent;
    int fullLayer;
    Color color;



    private CardColor() {
	}

	CardColor(int layer1_rent, int layer2_rent,  int fullLayer,Color color) {
        this.layer1_rent = layer1_rent;
        this.layer2_rent = layer2_rent;
        this.fullLayer = fullLayer;
        this.color  = color;

    }

    CardColor(int layer1_rent, int layer2_rent, int layer3_rent, int fullLayer,Color color) {
        this.layer1_rent = layer1_rent;
        this.layer2_rent = layer2_rent;
        this.layer3_rent = layer3_rent;
        this.fullLayer = fullLayer;
        this.color  = color;
    }


     CardColor(int layer1_rent, int layer2_rent, int layer3_rent, int layer4_rent, int fullLayer,Color color) {
        this.layer1_rent = layer1_rent;
        this.layer2_rent = layer2_rent;
        this.layer3_rent = layer3_rent;
        this.layer4_rent = layer4_rent;
        this.fullLayer = fullLayer;
        this.color  = color;
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

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
}
