package ua.com.dagget.array;
/**
*1.Make it work. 2.Make it right. 3.Make it fast
*/
class AddArrayData {

  static int[]  addIntData(){

       int[] arr = new int[10];

       for (int k = 0; k < arr.length; k++){
           arr[k] = k;
           //System.out.println(arr[k]);
       }
       return arr;
    }

    static String addStringData(){

      String [] arr = new String[5];
      arr [0] = "one";
      arr [1] = "two";
      arr [2] = "thry";
      arr [3] = "vour";
      arr [4] = "five";
      for (int k = arr.length-1; k>0; k--) {
          System.out.println(arr[k]);
      }
      return null;
    }

}
