package Array;

public class array_26 {
  public static void showArray(String [][] array){
    System.out.print("{ ");
    for(int i = 0; i <array.length; i++) {
      System.out.print("{");
      for(int j = 0; j < array[i].length; j++){
        System.out.print(array[i][j]);
        if(j < array[i].length-1){
          System.out.print(", ");
        }
      }
      System.out.print("}");
      if(i <array.length-1){
        System.out.print(", ");
      }
    }
    System.out.print(" }");
  }

  public static void main(String[] args) {
    showArray(new String[][]{{"2", "6"}, {"1","ghghgh"}, {"4", "9", "hhh"}});
  }
}
