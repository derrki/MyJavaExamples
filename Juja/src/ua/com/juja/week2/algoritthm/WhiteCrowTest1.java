package ua.com.juja.week2.algoritthm;

/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
public class WhiteCrowTest1 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 3, 4};
        int position = WhiteCrow.find(nums);

        if (position == 6) {
            System.out.println("OK");
        } else {
            System.out.println("FAIL");
        }
    }
}
