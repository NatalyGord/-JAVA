//метод из неопределенного количества массивов делает один массив
package Array;

public class array_27 {
  public static void abc(String [] ... str){
    int len = 0;
    for (String[] d: str){
      for(String c: d){
        len++;
      }
    }
    String [] array = new String[len];
    int m = 0;
    for (int j = 0; j < str.length; j++){
      int n = 0;
      for(int i = 0; i < str[j].length; i++){

        array[i + m] = str[j][i];
        n++;
      }
      m = m + n;
    }
    for (String s: array){
      System.out.print(s + " ");
    }
  }

  public static void main(String[] args) {
    String[] a = new String[]{"fff", "aaa", "ggg"};
    String[] b = new String[]{"vvv", "mmm"};
    String[] v = new String[]{"1111", "3333", "555"};

    abc(a, b, v);
    //abc();
  }
}
