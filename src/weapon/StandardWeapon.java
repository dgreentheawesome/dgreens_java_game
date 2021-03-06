/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weapon;

import java.awt.Color;
import java.awt.Point;
import phyics.CollisionConstants;
import unit.StandardProjectile;
import unit.Unit;

/**
 *
 * @author david.green
 */
public class StandardWeapon implements Weapon {
    
    public static final int STANDARD_BULLET_SPEED = 15;
    private Unit attachedUnit;
    private int damage;

    public StandardWeapon(Unit attachedUnit, int damage) {
        this.attachedUnit = attachedUnit;
        this.damage = damage;
        
    }
    
    @Override
    public void fire(Point Location, Point target, int CollisionConstant) {
        StandardProjectile x = new StandardProjectile(Color.RED, 3, Location.x, Location.y, target
        ,CollisionConstant, STANDARD_BULLET_SPEED); 
        x.setDamage(this.getDamage());
        x.onCreate();
      
    }

    public Unit getAttachedUnit() {
        return attachedUnit;
    }

    public void setAttachedUnit(Unit attachedUnit) {
       // this.attachedUnit = attachedUnit;
    }

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public void setDamage(int damage) {
        this.damage = damage;
    }
    
}

