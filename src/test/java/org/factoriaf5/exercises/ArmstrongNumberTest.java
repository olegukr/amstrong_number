/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

package org.factoriaf5.exercises;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author olegpoberezhets
 */
public class ArmstrongNumberTest {

    public ArmstrongNumberTest() {
    }

    /**
     * Test of checkArmstrong method, of class ArmstrongNumber.
     */
    @org.junit.Test
    public void testCheckArmstrong371_true() {
        System.out.println("checkArmstrong");
        int num = 371;
        Boolean expResult = true;
        Boolean result = ArmstrongNumber.checkArmstrong(num);
        assertEquals(expResult, result);
    }

    /**
     * Test of calculateArmstrong method, of class ArmstrongNumber.
     */
    @org.junit.Test
    public void testCalculateArmstrong371c_true() {
        System.out.println("calculateArmstrong");
        int num = 371;
        int expResult = 371;
        int result = ArmstrongNumber.calculateArmstrong(num);
        assertEquals(expResult, result);
    }

    /**
     * Test of checkArmstrong method, of class ArmstrongNumber.
     */
    @org.junit.Test
    public void testCheckArmstrong351_false() {
        System.out.println("checkArmstrong");
        int num = 351;
        Boolean expResult = false;
        Boolean result = ArmstrongNumber.checkArmstrong(num);
        assertEquals(expResult, result);
    }

        /**
     * Test of checkArmstrong method, of class ArmstrongNumber.
     */
    @org.junit.Test
    public void testCheckArmstrong2015_false() {
        System.out.println("checkArmstrong");
        int num = 2015;
        Boolean expResult = false;
        Boolean result = ArmstrongNumber.checkArmstrong(num);
        assertEquals(expResult, result);
    }

    @org.junit.Test
    public void testCheckArmstrong1634_true() {
        System.out.println("checkArmstrong");
        int num = 1634;
        Boolean expResult = true;
        Boolean result = ArmstrongNumber.checkArmstrong(num);
        assertEquals(expResult, result);
    }

    /**
     * Test of calculateArmstrong method, of class ArmstrongNumber.
     */
    @org.junit.Test
    public void testCalculateArmstrong1634c_true() {
        System.out.println("calculateArmstrong");
        int num = 1634;
        int expResult = 1634;
        int result = ArmstrongNumber.calculateArmstrong(num);
        assertEquals(expResult, result);
    }

}