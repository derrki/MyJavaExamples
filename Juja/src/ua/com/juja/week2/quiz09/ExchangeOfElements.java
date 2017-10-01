package ua.com.juja.week2.quiz09;

/**
 * 1. Make it work. 2. Make it right. 3. Make it fast
 */
public class ExchangeOfElements {

   int[] exchangeOfElements (int [] array, int i, int j){

       int tmp = array[i];
       array[i] = array[j];
       array[j] = tmp;
       return array;
   }

}
