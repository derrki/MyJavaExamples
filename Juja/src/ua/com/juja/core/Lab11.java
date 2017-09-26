package ua.com.juja.core;

public class Lab11 {
    public int lookFor(int max) {
        int coounter = 0;
        for (int a = 1; a <= max; a++) {
                for (int b = 1; b <= max; b++) {
                    if ((a * a) + (b * b) <= max) {
                        coounter++;
                    }
                }
            }
        System.out.print(coounter);
        return coounter;
    }
}
