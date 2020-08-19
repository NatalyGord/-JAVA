//сортировка массива
package Array;

public class array_25 {
  public static void sortirovka(int [] array){
    int a;
    for(int j = 0; j <array.length; j++) {
      int min = array[j];
      int ind = j;


      for (int i = j + 1; i < array.length; i++) {
        if (array[i] < min) {
          min = array[i];
          ind = i;
        }
      }
      if(j != ind){
        a = array[j];
        array[j] = min;
        array[ind] = a;
      }

    }
    for(int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
  }

  public static void main(String[] args) {
    sortirovka(new int[]{2, 6, 1, 4, 9});
  }
}
