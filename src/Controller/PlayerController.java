package Controller;

import  Model.Player.Player;

import java.util.ArrayList;

public class PlayerController {
    private  GameController gameController;
    private  Player currentplayer;
    private ArrayList<Player> players;

    private int playerNumber;

    public PlayerController(GameController gameController){
        this.gameController = gameController;
        playerNumber = gameController.getPlayerNumber();
        players = new ArrayList<>();
        initPlayer();
        currentplayer = players.get(0);

    }



    private void initPlayer() {
        if(playerNumber==2) {
            Player player1 = new Player(1);
            Player player2 = new Player(2);
            players.add(player1);
            players.add(player2);
        }else if(playerNumber==3) {
            Player player1 = new Player(1);
            Player player2 = new Player(2);
            Player player3 = new Player(3);
            players.add(player1);
            players.add(player2);
            players.add(player3);


        }else if(playerNumber==4) {
            Player player1 = new Player(1);
            Player player2 = new Player(2);
            Player player3 = new Player(3);
            Player player4 = new Player(4);
            players.add(player1);
            players.add(player2);
            players.add(player3);
            players.add(player4);
        }else{
            Player player1 = new Player(1);
            Player player2 = new Player(2);
            Player player3 = new Player(3);
            Player player4 = new Player(4);
            Player player5 = new Player(5);
            players.add(player1);
            players.add(player2);
            players.add(player3);
            players.add(player4);
            players.add(player5);
        }
        gameController.setPlayersArr(players);
    }

    public void changeTONextPlayer(){
       int  currentIndex =  players.indexOf(currentplayer);
       if(currentIndex+1 == playerNumber){
           currentplayer = players.get(0);
       }else {
           currentplayer = players.get(currentIndex+1);
       }
    }

    public GameController getGameController() {
        return gameController;
    }

    public void setGameController(GameController gameController) {
        this.gameController = gameController;
    }

    public Player getCurrentplayer() {
        return currentplayer;
    }

    public void setCurrentplayer(Player currentplayer) {
        this.currentplayer = currentplayer;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }
    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

}
