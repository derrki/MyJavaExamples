package ua.com.dagget.helpClasses;


public class PrintMetod {

    public void print (String str){

        if (str.isEmpty()){
            System.out.print("Нема що друкувати !!!");
        } else {
            System.out.print(str);
        }

    }

    public void println (String str){

        if (str.isEmpty()){
            System.out.println("Нема що друкувати !!!");
        } else {
            System.out.println(str);
        }

    }
}
