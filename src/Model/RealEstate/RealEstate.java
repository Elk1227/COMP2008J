package Model.RealEstate;

import Model.Building.Building;
import Model.Cards.CardColor;
import Model.Cards.Properties.PropertyCard;
import Model.Player.Player;

import java.util.ArrayList;

public class RealEstate {
    ArrayList<Building> buildings;
    Player owner;

    public RealEstate(Player owner) {
        this.buildings = new ArrayList<>();
        this.owner = owner;
    }

    public RealEstate(){
        this.buildings = new ArrayList<>();
    }
    
    public boolean addRealEstate(PropertyCard propertycard) {
        if(checkIfCanInsert(propertycard.getColor())){
            for (Building building : buildings) {
                if (building.getColorOfBuilding() == propertycard.getColor()) {
                    building.buildBuilding(propertycard);
                    return true;
                }
            }
            Building building = new Building(propertycard.getColor());
            building.buildBuilding(propertycard);
            this.addBuilding(building);
            return true;

        }
        return false;
    }

    public void removeRealEstate(PropertyCard propertycard) {
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

    public  int getSize(){
        return  buildings.size();
    }


    public ArrayList<Building> getBuildings() {
        return buildings;
    }
}