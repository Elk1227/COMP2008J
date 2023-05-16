package RealEstate;

import Building.Building;
import Cards.Properties.Propertycard;
import Player.Player;

import java.util.ArrayList;

public class RealEstate {
    ArrayList<Building> buildings;
    Player owner;

    public boolean addRealEstate(Propertycard propertycard) {
        int i = 0;
        for (Building building : buildings) {
            if (building.getColorOfBuilding() == propertycard.getColor() && i < 1) {
                building.buildBuilding(propertycard);
                i++;
                return true;
            }
        }
        if (i == 0) {
            Building building = new Building(propertycard.getColor());
            return true;
        }else{
            return false;
        }
    }

    public void removeRealEstate(Propertycard propertycard) {
        for (Building building : buildings) {
            if (building.getColorOfBuilding() == propertycard.getColor()) {
                building.reduceLayer(propertycard);
            }

        }
    }
    public boolean checkWin(){
        int i = 0;
        for (Building building : buildings) {
            if(building.isFull()==true){
                i++;
            }
        }
        if(i==3){
            return true;
        }else {
            return false;
        }

    }
    public void  addBuilding(Building building) {
        buildings.add(building);
    }
    public  void removeBuilding(Building building){
        buildings.remove(building);
    }
}