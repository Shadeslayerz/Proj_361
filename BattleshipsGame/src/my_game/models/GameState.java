/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my_game.models;

import my_game.models.game_components.CoralReef;
import my_game.models.game_components.Map;
import my_game.models.game_components.Ship;
import my_game.models.player_components.ChatLog;
import my_game.networking.server.entities.Player;

/**
 * The state of a game describes a game fully.
 */
public class GameState {
    
    /** An array of two players who are playing the game. */
    private Player[] player;
    
    /** Index of the players array pointing to the player whose turn it currently is. */
    private int playerTurn;
    
    /** The name of the game given to it when it is created for the first time. */
    public final String name;
    
    /** Identifier for the game. */
    //public final int gameID;    // TODO Is this necessary? Please clarify why. Also it will be unnecessarily comples to generate unique IDs
    
    protected ChatLog chatLog;
    protected Map map;
    
    //TODO accessors and mutators for chat log and map

    public GameState(Player[] player, CoralReef reef, int firstPlayer, String name) {
        //init the players array
        this.player = new Player[2];
        this.player[0] = player[0];
        this.player[1] = player[1]; 
        //init player turn
        this.playerTurn = firstPlayer;
        //set game name
        this.name = name;
        //init each player's ships
        Ship[] player1Ships = generateShips(player[0]);
        Ship[] player2Ships = generateShips(player[1]);
        //init map
        map = new Map(reef, player1Ships, player2Ships);
        //init chat
        chatLog = new ChatLog();
    }
    
    public GameState(GameState copyState) {
        //TODO copy all fields of the copyState to this game state
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private Ship[] generateShips(Player player) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
