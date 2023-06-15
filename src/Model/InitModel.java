package Model;

import  Model.Player.Player;

import java.util.ArrayList;

public class InitModel {


    public void initPlayer(ArrayList<Player> playersArr, int playerNumber) {
        if(playerNumber==2) {
            Player player1 = new Player(1);
            Player player2 = new Player(2);
            playersArr.add(player1);
            playersArr.add(player2);
        }else if(playerNumber==3) {
            Player player1 = new Player(1);
            Player player2 = new Player(2);
            Player player3 = new Player(3);
            playersArr.add(player1);
            playersArr.add(player2);
            playersArr.add(player3);


        }else if(playerNumber==4) {
            Player player1 = new Player(1);
            Player player2 = new Player(2);
            Player player3 = new Player(3);
            Player player4 = new Player(4);
            playersArr.add(player1);
            playersArr.add(player2);
            playersArr.add(player3);
            playersArr.add(player4);
        }else{
            Player player1 = new Player(1);
            Player player2 = new Player(2);
            Player player3 = new Player(3);
            Player player4 = new Player(4);
            Player player5 = new Player(5);
            playersArr.add(player1);
            playersArr.add(player2);
            playersArr.add(player3);
            playersArr.add(player4);
            playersArr.add(player5);
        }
    }
}
