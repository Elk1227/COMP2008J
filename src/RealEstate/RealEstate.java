package RealEstate;

import Building.Building;
import Cards.CardColor;
import Cards.Properties.Propertycard;
import Player.Player;

import java.util.ArrayList;

public class RealEstate {
    ArrayList<Building> buildings;
    Player owner;

    public boolean addRealEstate(Propertycard propertycard) {
        if(checkIfCanInsert(propertycard.getColor())){
            for (Building building : buildings) {
                if (building.getColorOfBuilding() == propertycard.getColor()) {
                    building.buildBuilding(propertycard);
                    return true;
                }
            }
        }
        return false;
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

    public boolean checkIfCanInsert(CardColor color){
        int i = 0;
        for (Building building : buildings) {
            if(building.getColorOfBuilding()==color){
                if(building.isFull()){
                    i++;
                }

            }
        }
        if(i==0){
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