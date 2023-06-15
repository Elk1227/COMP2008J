package Model.Building;

import Model.Cards.ActionCard.HotelCard;
import Model.Cards.ActionCard.HouseCard;
import Model.Cards.CardColor;
import Model.Cards.Properties.PropertyCard;

import java.util.ArrayList;

public class Building {
    private ArrayList<PropertyCard> building;
    private ArrayList<HotelCard> hotel;
    private ArrayList<HouseCard> house;
    private CardColor colorOfBuilding;
    private int rentOfBuilding  ;

    private int rentOfHotel ;
    private int rentOfHouse ;
    private int rent ;
    private int layer;
    private boolean isFull;

    public Building(CardColor colorOfBuilding) {
        building = new ArrayList<>();
        this.colorOfBuilding = colorOfBuilding;
        rentOfHouse = 0;
        rentOfHotel = 0;
        rentOfBuilding = colorOfBuilding.getLayer1_rent();
        updateRent();
        layer = 1;
        isFull = false;
    }
    public void buildBuilding(PropertyCard propertycard){
        if(!isFull){
            building.add(propertycard);
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
            checkIsFull();
        }
    }
    public void updateRent(){
        rent = rentOfBuilding+rentOfHotel+rentOfHouse;
    }
    public void checkIsFull(){
        if(layer == building.get(0).getFullLayer()){
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

    public void reduceLayer(PropertyCard propertycard){
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

    public ArrayList<PropertyCard> getBuilding() {
        return building;
    }

    public ArrayList<HotelCard> getHotel() {
        return hotel;
    }

    public ArrayList<HouseCard> getHouse() {
        return house;
    }

    public CardColor getColorOfBuilding() {
        return colorOfBuilding;
    }

    public int getRentOfBuilding() {
        return rentOfBuilding;
    }

    public int getRentOfHotel() {
        return rentOfHotel;
    }

    public int getRentOfHouse() {
        return rentOfHouse;
    }

    public int getRent() {
        return rent;
    }

    public int getLayer() {
        return layer;
    }
}
