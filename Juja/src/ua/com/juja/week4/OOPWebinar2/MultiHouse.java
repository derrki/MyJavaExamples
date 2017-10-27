package ua.com.juja.week4.OOPWebinar2;

/**
 * 1.Make it work. 2.Make it right. 3.Make it fastpublic
 */
class MultiHouse {

    private Floor[] floors;
    private Porch porch1;
    private Porch porch2;

    MultiHouse(int n) {

        floors = new Floor[n];
        for (int index = 0; index < n; index++) {
            floors[index] = new Floor(index + 1);
        }
    }

    Floor get(int index) {
        return floors[index - 1];
    }

    public Porch getLeftPorch1() {
        return porch1;
    }

    public Porch getLeftPorch2() {
        return porch2;
    }

    @Override
    public String toString() {

        String result = "I am Multi house \n";
        for (Floor floor : floors) {
            result += "\t" + floor.toString() + "\n";
        }
        return result;
    }
}
