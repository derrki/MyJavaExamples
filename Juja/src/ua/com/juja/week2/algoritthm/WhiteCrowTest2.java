package ua.com.juja.week2.algoritthm;

/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
public class WhiteCrowTest2 {
    public static void main(String[] args) {
        int[] nums = {1, 2};
        int position = WhiteCrow.find(nums);

        int expected = -1;
        if (position == expected) {
            System.out.println("OK");
        } else {
            System.out.println("Was: " + position + " but expected: " + expected);
            System.out.println("FAIL");
        }
    }
}
