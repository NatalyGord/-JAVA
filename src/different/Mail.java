//выводит какими почтами пользуются
package different;

public class Mail {
  static void email(String str){
    char c1;
    char c2;
    for(int i = 0; i < str.length(); i++){
      c1 = str.charAt(i);
      if(c1 == '@'){
        for(int j = i + 1; j<str.length(); j++){
          c2 = str.charAt(j);
          if(c2 == '.'){
            break;
          }
          System.out.print(c2);
        }
        System.out.println();
      }
    }
  }

  public static void main(String[] args) {
    email("ya@yahoo.com; on@mail.ru; ona@gmail.com;");
  }
}
