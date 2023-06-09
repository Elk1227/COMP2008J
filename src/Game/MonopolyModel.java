package Game;

import java.util.ArrayList;
import java.util.List;

public class MonopolyModel {
    private List<Integer> ageList;

    public static int selectedValue;

    public MonopolyModel() {
        ageList = new ArrayList<>();
    }

    public void addAge(int age) {
        ageList.add(age);
    }

    public List<Integer> getAgeList() {
        return ageList;
    }

    public boolean isAgeListComplete(int selectedMembers) {
        return ageList.size() == selectedMembers;
    }

    public boolean isInputMember(int selectedMembers){
        if(ageList == null||!isAgeListComplete(selectedMembers)){
            return false;
        }else{
            return  true;
        }
    }

    public boolean isInvalidAge(int age) {
        return age < 8||age>100;
    }
}

