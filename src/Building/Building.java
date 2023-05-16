package Building;

import Cards.ActionCard.HotelCard;
import Cards.ActionCard.HouseCard;
import Cards.CardColor;
import Cards.Properties.Propertycard;

import java.util.ArrayList;

public class Building {
    ArrayList<Propertycard> building;
    ArrayList<HotelCard> hotel;
    ArrayList<HouseCard> house;
    CardColor colorOfBuilding;

    int rentOfBuilding = 0 ;

    int rentOfHotel = 0;
    int rentOfHouse = 0;
    int rent = 0;
    int layer;
    boolean isFull = false;

    public CardColor getColorOfBuilding() {
        return colorOfBuilding;
    }

    public int getRent() {
        return rent;
    }

    public int getLayer() {
        return layer;
    }
    public void buildBuilding(Propertycard propertycard){
        if(!isFull){
            building.add(propertycard);
            layer= building.size();
            checkIsFull();
            if(layer == 1){
                rentOfBuilding = colorOfBuilding.getLayer1_rent();
            } else if (layer == 2) {
                rentOfBuilding = colorOfBuilding.getLayer2_rent();
            } else if (layer == 3) {
                rentOfBuilding = colorOfBuilding.getLayer3_rent();
            }else {
                rentOfBuilding = colorOfBuilding.getLayer4_rent();
            }
            updateRent();
        }
    }
    public void updateRent(){
        rent = rentOfBuilding+rentOfHotel+rentOfHouse;
    }
    public void checkIsFull(){
        if(layer == building.get(0).fullLayer){
            isFull = true;
        }
    }

    public void buildHouse(HouseCard housecard){
        if(isFull){
            house.add(housecard);
            int layer = house.size();
            rentOfHouse = layer*3;
            updateRent();

        }
    }
    public void buildHotel(HotelCard hotelCard){
        if(isFull){
            hotel.add(hotelCard);
            int layer = hotel.size();
            rentOfHotel = layer*4;
            updateRent();
        }

    }

    public void reduceLayer(Propertycard propertycard){
        if (!isFull){
            building.remove(propertycard);
            layer= building.size();
            if(layer == 1){
                rentOfBuilding = colorOfBuilding.getLayer1_rent();
            } else if (layer == 2) {
                rentOfBuilding = colorOfBuilding.getLayer2_rent();
            } else if (layer == 3) {
                rentOfBuilding = colorOfBuilding.getLayer3_rent();
            }else {
                rentOfBuilding = colorOfBuilding.getLayer4_rent();
            }
            updateRent();
        }

    }

    public boolean isFull() {
        return isFull;
    }
}
