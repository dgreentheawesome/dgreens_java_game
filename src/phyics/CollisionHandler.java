/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phyics;

import java.util.ArrayList;
import java.util.Collections;
import unit.Unit;

/**
 *
 * @author David
 */
public class CollisionHandler {
    int[] indexes;

    public CollisionHandler() {
        this.indexes = new int[CollisionConstants.CODE_LIST.length];
    }
    
    public void ComputeAndHandle(ArrayList<Unit> u) {
        //Collections.sort(u);
        //System.out.println(u);
        //TODO

        //compare enemy projectiles against neutral and friendly units
        //UPDATE THE LIST
        //compare friendly projectiles against enemy and neutral units
        //UPDATE THE LIST
        //compare enemy units vs friendly AND neutral units
        //UPDATE THE LIST
        //compare friendly units vs neutral units
        //UPDATE THE LIST
    }

    /**
     * Compares collisions of one against two
     *
     * @param one ArrayList to compare against two.
     * @param two ArrayList to be compared against.
     * @param reverse boolean signal to reverse comparisons in the case of a
     * collision, one.get(x).onHit(y) is called if reverse is true,
     * two.get(y).onHit(one.get(x) is called
     *
     */
    private void computeAndHandleSubset(ArrayList<Unit> one, ArrayList<Unit> two, boolean reverse) {
    }

    /**
     * updates the class variables that keep track of divisions between types of
     * units.
     */
    private void updateListLocs(int CollisionConstant, boolean add) {
        for (int i = CollisionConstant + 1; i < indexes.length; i++) {
            indexes[i]--;           
        }
    }
    /**
     * 
     * @param CollisionCode returns the index of the last occurence of a unit 
     * with the specified code in u;
     */
    private void getListLoc(int CollisionCode){
        
    }

}
