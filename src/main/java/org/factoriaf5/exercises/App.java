package org.factoriaf5.exercises;

import java.util.ArrayList;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {

        // Two positive cases (371 and 1634) and two negative cases (351 and 2015)

        ArrayList<Integer> arrayNum = new ArrayList<>();
        arrayNum.add(371);
        arrayNum.add(1634);
        arrayNum.add(351);
        arrayNum.add(2015);
        
        for (int item : arrayNum) {
            if ( ArmstrongNumber.checkArmstrong(item)) {
                System.out.println("num: " + item + " - is Armstrong Number");
            } else {
                System.out.println("num: " + item + " - is not Armstrong Number");
            }
        }  
    }
}
