package ua.com.dagget.arrayCRUD;

public class Test2 {
    public static void main(String[] args) {
        ArrayCRUD arrayCRUD = new ArrayCRUD();
        ArrayCRUD arrayCRUD2 = new ArrayCRUD();
        ArrayCRUD arrayCRUD1 = arrayCRUD;

        System.out.println(arrayCRUD1.equals(arrayCRUD));
        System.out.println(arrayCRUD);
        System.out.println(arrayCRUD1);
        System.out.println(arrayCRUD2);
    }
}
