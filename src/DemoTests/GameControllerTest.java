package DemoTests;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import Model.Player.*;
import Controller.GameController;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class GameControllerTest {

    private GameController gameController;

    @BeforeEach
    public void setup() {
        gameController = new GameController();
    }

    @Test
    public void testInitGame() {
        // Ensure the initialization of the game is performed correctly
        gameController.initGame();
        System.out.println("Successful test");
    }

    @Test
    public void getPlayerNumberTest() {
        // Test the getPlayerNumber() method returns the correct player number
        int expectedPlayerNumber = 5;
        gameController.setPlayerNumber(expectedPlayerNumber);
        int actualPlayerNumber = gameController.getPlayerNumber();
        assertEquals(expectedPlayerNumber, actualPlayerNumber);
        System.out.println("Successful test");
    }

    @Test
    public void setPlayersArrTest() {
        // Test the setPlayersArr() method sets the players array correctly
        ArrayList<Player> playersArr = new ArrayList<>();
        Player player1 = new Player(1);
        playersArr.add(player1);
        gameController.setPlayersArr(playersArr);
        ArrayList<Player> actualPlayersArr = gameController.getPlayersArr();
        assertNotNull(actualPlayersArr);
        assertEquals(playersArr, actualPlayersArr);
        System.out.println("Successful test");
    }

}
