package org.factoriaf5.exercises;


public class ArmstrongNumber {
    static int num = 1;

    // 371 = 3(3) + 7(3) + 1(3) = 27 + 343 + 1 = 371

    public static Boolean checkArmstrong(int num) {
        return num == ArmstrongNumber.calculateArmstrong(num); 
    }
        
    public static int calculateArmstrong(int num) {
        int numSize = (int) Math.floor(Math.log10(num) + 1);
        int result = 0;
        for (int i = 1; i < (numSize + 1) ; i++) {
            int digit = num % 10;
            num = (int)(num / 10);
            result += Math.pow(digit, numSize);
        }
        return result;
    }
}
