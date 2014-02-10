/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my_game.models.game_components;

/**
 *
 */
public abstract class Ship {
    
    public enum ShipType {
        Cruiser, Destroyer, TorpedoBoat, MineLayer, RadarBoat
    };
    
    /** The type of this ship. */
    protected ShipType shipType;
    protected ShipUnit[] shipUnits;
    protected final int playerID;
    protected int size;
    protected int speed;
    protected int currentSize;
    protected int currentSpeed;
    protected boolean heavyArmour;
    protected int[] radarRange;
    protected int[] canonRange;
    protected Weapon[] availableWeapons;
    //maybe use ints to represent weapons
    //1:heavy cannon, 2:canon, 3:torpedoes, 4: mines
    
/*    public Ship(ShipType st, ShipUnit[] su, int pid, int size, int speed, int csize, int cspeed, 
                boolean armour, int[] rRange, int[] cRange, Weapon[] w){
        super(id);
        this.shipType = st;
        this.shipUnits = su;
        this.size = size;
        this.speed = speed;
        this.currentSize = csize;
        this.currentSpeed = cspeed;
        this.heavyArmour = armour;
        this.radarRange = rRange;
        this.canonRange = cRange;
        this.availableWeapons = w;
  */
    /** Constructs a ship given a player ID. */
    public Ship(int pid){
        this.playerID = pid;
    }
    
    /**
     * @return The type of this ship.
     */
    public ShipType getShipType() {
        return this.shipType;
    }
    
    public int getCurrentSpeed(){
        return currentSpeed;
    }
    
    /**
     * This method return true if the ship can turn 180 degree in one turn
     * (Torpedoand radar boat)
     * 
     * @return 
     */
    public boolean hasFlexibleTurn(){
        return false;
    }
    
    /**
     * 
     * @return array of 3 ints, indicating the number of square to the left/right,
     * front, and back??
     */
    public int[] getRadarRange(){
        return radarRange;       
    }
    
    /**
     * 
     *@return array of 3 ints, indicating the number of square to the left/right,
     * front, and back. 
     */
    public int[] getCanonRange(){
        return canonRange;
    }
}
