//метод сравнения значений StringBuilder
package different;

public class diff_35 {
  public static void ravenstvo(StringBuilder sb1, StringBuilder sb2){
    boolean res = false;
    if(sb1.length() == sb2.length()){
      for(int i = 0; i < sb1.length(); i++){
        if(sb1.charAt(i) == sb2.charAt(i)){
          res = true;
        }
        else{
          res = false;
          break;
        }
      }
    }
    System.out.println(res);
  }

  public static void main(String[] args) {
    String a = "Yes!!";
    StringBuilder sb3 = new StringBuilder("Hello");
    StringBuilder sb4 = new StringBuilder("Yes!!");
    StringBuilder sb5 = new StringBuilder(a);
    ravenstvo(sb3, sb4);
    ravenstvo(sb3, sb5);
    ravenstvo(sb4, sb5);
  }
}
