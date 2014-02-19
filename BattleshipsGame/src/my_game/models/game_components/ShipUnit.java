/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package my_game.models.game_components;

import my_game.util.Vector2;

/**
 *
 * @author wei
 */
public class ShipUnit extends GameObject {
    private int damageLevel; // (0: healthy, 1: damaged, 2: destroyed)

    private Vector2 position;
    private Ship ship;
    
    public ShipUnit(Ship ship){
        
          this.ship = ship;
          this.type = GameObjectType.Ship;
          this.damageLevel = 0;
    }
    
    public Ship getShip() {
        return ship;
    }
    
    public Vector2 getPosition(){
        Vector2 posCopy = new Vector2(this.position);
        return posCopy;
    }
    
    public void setPosition(Vector2 newPosition){
       // error checking?
        position.x = newPosition.x;
        position.y = newPosition.y;
    }
    
    public int getDamageLevel(){
        return damageLevel;
    }
    
    public void setDamage(int damage){
        if (damageLevel < 2){
            damageLevel = damageLevel + damage;
        }// may need to set as destroyed immediately;
        
    }
}
