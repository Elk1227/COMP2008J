package DemoTests;
import  Model.Cards.CardColor;
import Model. Cards.Properties.PropertyCard;
import Model. Player.Player;
import Model. RealEstate.RealEstate;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import  Model.Building.Building;

public class RealEstateTest {
    private RealEstate realEstate;
    private Player owner;

    @Before
    public void setup() {
        owner = new Player(1);
        realEstate = new RealEstate(owner);
    }

    @Test
    public void addSingleBuildingTest() {
        PropertyCard propertyCard =new PropertyCard("Green property card", Model. Cards.CardPrice.M4, Model.Cards.CardColor.Green,3,"resources/property cards/Green.jpg");
        boolean result = realEstate.addRealEstate(propertyCard);
        Assert.assertTrue(result);
        Assert.assertEquals(1, realEstate.getSize());
        System.out.println("Successful test");
    }

    @Test
    public void addMultipleBuildingsTest() {
        PropertyCard propertyCard1 = new PropertyCard("Orange property card",  Model.Cards.CardPrice.M2, Model.Cards.CardColor.Orange,3,"resources/property cards/Orange.jpg");
        PropertyCard propertyCard2 = new PropertyCard("Pink property card",  Model.Cards.CardPrice.M2, Model.Cards.CardColor.Pink,3,"resources/property cards/Pink.jpg");
        PropertyCard propertyCard3 = new PropertyCard("Railroad property card",  Model.Cards.CardPrice.M2, Model.Cards.CardColor.Black,4,"resources/property cards/Railroad.jpg");
        boolean result1 = realEstate.addRealEstate(propertyCard1);
        boolean result2 = realEstate.addRealEstate(propertyCard2);
        boolean result3 = realEstate.addRealEstate(propertyCard3);
        Assert.assertTrue(result1);
        Assert.assertTrue(result2);
        Assert.assertTrue(result3);
        Assert.assertEquals(3, realEstate.getSize());
        System.out.println("Successful test");
    }

    @Test
    public void addSameColorBuildingTest() {
        PropertyCard propertyCard1 = new PropertyCard("Pink property card",  Model.Cards.CardPrice.M2, Model.Cards.CardColor.Pink,3,"resources/property cards/Pink.jpg");
        PropertyCard propertyCard2 = new PropertyCard("Pink property card",  Model.Cards.CardPrice.M2, Model.Cards.CardColor.Pink,3,"resources/property cards/Pink.jpg");
        PropertyCard propertyCard3 = new PropertyCard("Pink property card",  Model.Cards.CardPrice.M2, Model.Cards.CardColor.Pink,3,"resources/property cards/Pink.jpg");
        boolean result1 = realEstate.addRealEstate(propertyCard1);
        boolean result2 = realEstate.addRealEstate(propertyCard2);
        boolean result3 = realEstate.addRealEstate(propertyCard3);
        Assert.assertTrue(result1);
        Assert.assertTrue(result2);
        Assert.assertTrue(result3);
        Assert.assertEquals(1, realEstate.getSize());
        System.out.println("Successful test");
    }


    @Test
    public void reduceLayerTest() {
        PropertyCard propertyCard1 = new PropertyCard("Orange property card", Model. Cards.CardPrice.M2, Model.Cards.CardColor.Orange,3,"resources/property cards/Orange.jpg");
        PropertyCard propertyCard2 = new PropertyCard("Orange property card", Model. Cards.CardPrice.M2, Model.Cards.CardColor.Orange,3,"resources/property cards/Orange.jpg");
        realEstate.addRealEstate(propertyCard1);
        realEstate.addRealEstate(propertyCard2);
        Building building= realEstate.getBuildings().get(0);
        Assert.assertEquals(2, building.getLayer());
        realEstate.removeRealEstate(propertyCard1);
        Assert.assertEquals(1, building.getLayer());
        System.out.println("Successful test");
    }

    @Test
    public void canNotRemoveFullBuildingTest() {
        PropertyCard propertyCard1 = new PropertyCard("Brown property card",  Model.Cards.CardPrice.M1, Model.Cards.CardColor.Brown,2,"resources/property cards/Brown.jpg");
        PropertyCard propertyCard2 = new PropertyCard("Brown property card",  Model.Cards.CardPrice.M1, Model.Cards.CardColor.Brown,2,"resources/property cards/Brown.jpg");

        realEstate.addRealEstate(propertyCard1);
        realEstate.addRealEstate(propertyCard2);

        Building building= realEstate.getBuildings().get(0);
        Assert.assertEquals(2, building.getLayer());
        realEstate.removeRealEstate(propertyCard1);
        Assert.assertFalse(building.getLayer()==1);
        System.out.println("Successful test");
    }
    
    @Test
    public void checkWinFalse() {
        PropertyCard propertyCard1 = new PropertyCard("Orange property card", Model. Cards.CardPrice.M2, Model.Cards.CardColor.Orange,3,"resources/property cards/Orange.jpg");
        PropertyCard propertyCard2 = new PropertyCard("Pink property card",  Model.Cards.CardPrice.M2, Model.Cards.CardColor.Pink,3,"resources/property cards/Pink.jpg");
        PropertyCard propertyCard3 = new PropertyCard("Railroad property card", Model. Cards.CardPrice.M2, Model.Cards.CardColor.Black,4,"resources/property cards/Railroad.jpg");
        realEstate.addRealEstate(propertyCard1);
        realEstate.addRealEstate(propertyCard2);
        realEstate.addRealEstate(propertyCard3);
        boolean result = realEstate.checkWin();
        Assert.assertFalse(result);
        System.out.println("Successful test");
    }

    @Test
    public void checkWinTrue() {
        PropertyCard propertyCard1 = new PropertyCard("Utility property card",  Model.Cards.CardPrice.M2, Model.Cards.CardColor.LightGreen,2,"resources/property cards/Utility.jpg");
        PropertyCard propertyCard2 = new PropertyCard("Pink property card",  Model.Cards.CardPrice.M2, Model.Cards.CardColor.Pink,3,"resources/property cards/Pink.jpg");
        PropertyCard propertyCard3 = new PropertyCard("Railroad property card",  Model.Cards.CardPrice.M2, Model.Cards.CardColor.Black,4,"resources/property cards/Railroad.jpg");

        realEstate.addRealEstate(propertyCard1);
        realEstate.addRealEstate(propertyCard2);
        realEstate.addRealEstate(propertyCard3);

        Building building1 = realEstate.getBuildings().get(0);
        Building building2 = realEstate.getBuildings().get(1);
        Building building3 = realEstate.getBuildings().get(2);

        building1.buildBuilding(propertyCard1);
        building1.buildBuilding(propertyCard1);
       
        building2.buildBuilding(propertyCard2);
        building2.buildBuilding(propertyCard2);
        building2.buildBuilding(propertyCard2);

        building3.buildBuilding(propertyCard3);
        building3.buildBuilding(propertyCard3);
        building3.buildBuilding(propertyCard3);
        building3.buildBuilding(propertyCard3);

        boolean result = realEstate.checkWin();

        Assert.assertTrue(result);
        System.out.println("Successful test");
    }
    
    @Test
    public void checkIfCanInsert_noBuildingsWithColor_true() {
        CardColor color = CardColor.Green;
        boolean result = realEstate.checkIfCanInsert(color);
        Assert.assertTrue(result);
        System.out.println("Successful test");
    }

    @Test
    public void checkIfCanInsert_buildingWithColorNotFull_true() {
        CardColor color = CardColor.Black;
        PropertyCard propertyCard1 = new PropertyCard("Railroad property card",  Model.Cards.CardPrice.M2, Model.Cards.CardColor.Black,4,"resources/property cards/Railroad.jpg");
        realEstate.addRealEstate(propertyCard1);
        boolean result = realEstate.checkIfCanInsert(color);
        Assert.assertTrue(result);
        System.out.println("Successful test");
    }

    @Test
    public void checkIfCanInsert_buildingWithColorFull_false() {
        CardColor color = CardColor.Blue;
        PropertyCard propertyCard1 = new PropertyCard("Blue property card", Model. Cards.CardPrice.M4, Model.Cards.CardColor.Blue,2,"resources/property cards/Dark Blue.jpg");
        realEstate.addRealEstate(propertyCard1);
        Assert.assertTrue(realEstate.checkIfCanInsert(color));
        PropertyCard propertyCard2 = new PropertyCard("Blue property card",  Model.Cards.CardPrice.M4, Model.Cards.CardColor.Blue,2,"resources/property cards/Dark Blue.jpg");
        realEstate.addRealEstate(propertyCard2);
        Assert.assertFalse(realEstate.checkIfCanInsert(color));
        System.out.println("Successful test");
    }


}
