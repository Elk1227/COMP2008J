package DemoTests;

import  Model.Building.Building;
import  Model.Cards.ActionCard.HotelCard;
import  Model.Cards.ActionCard.HouseCard;
import Model. Cards.CardColor;
import Model. Cards.Properties.PropertyCard;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BuildingTest {
    private Building building;
    private PropertyCard propertyCard1;
    private PropertyCard propertyCard2;
    private HouseCard houseCard;
    private HotelCard hotelCard;

    @Before
    public void setup() {
        building = new Building(CardColor.Blue);
        propertyCard1 = new PropertyCard("Blue property card",  Model.Cards.CardPrice.M4, Model.Cards.CardColor.Blue,2,"resources/property cards/Dark Blue.jpg");
        propertyCard2 = new PropertyCard("Blue property card",  Model.Cards.CardPrice.M4, Model.Cards.CardColor.Blue,2,"resources/property cards/Dark Blue.jpg");
        houseCard = new HouseCard();
        hotelCard = new HotelCard();
    }

    @Test
    public void buildBuildingTest() {
        building.buildBuilding(propertyCard1);
        Assert.assertEquals(1, building.getBuilding().size());
        Assert.assertEquals(3, building.getRentOfBuilding());
        Assert.assertEquals(3, building.getRent());

    }

    @Test
    public void buildHouseTest() {
        building.buildBuilding(propertyCard1);
        building.buildBuilding(propertyCard2);
        building.buildHouse(houseCard);
        Assert.assertEquals(1, building.getHouse().size());
        Assert.assertEquals(3, building.getRentOfHouse());
        Assert.assertEquals(11, building.getRent());
    }

    @Test
    public void buildHotelTest() {
        building.buildBuilding(propertyCard1);
        building.buildBuilding(propertyCard2);
        building.buildHotel(hotelCard);
        Assert.assertEquals(1, building.getHotel().size());
        Assert.assertEquals(4, building.getRentOfHotel());
        Assert.assertEquals(12, building.getRent());
    }

    @Test
    public void reduceLayerTest() {
        building.buildBuilding(propertyCard1);
        building.reduceLayer(propertyCard1);
        Assert.assertEquals(0, building.getBuilding().size());

    }

    @Test
    public void isFullTest() {
        Assert.assertFalse(building.isFull());
        building.buildBuilding(propertyCard1);
        building.buildBuilding(propertyCard2);
        Assert.assertTrue(building.isFull());
    }
}
