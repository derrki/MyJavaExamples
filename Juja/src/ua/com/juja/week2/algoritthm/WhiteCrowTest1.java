package ua.com.juja.week2.algoritthm;

import java.util.Date;

/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
public class WhiteCrowTest1 {
    public static void main(String[] args) {
        long start = new Date().getTime();

        int[] nums = {1, 1, 2, 2, 3, 3, 4};
        int position = WhiteCrow.find(nums);

        int expected = 6;
        if (position == expected) {
            System.out.println("OK");
        } else {
            System.out.println("Was: " + position + " but expected: " + expected);
            System.out.println("FAIL");
        }

        long now = new Date().getTime();
        System.out.println("Time in mills: " + (now -start));
    }
}
