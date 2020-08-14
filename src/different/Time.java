package different;

public class Time {
  public static void Vre(){
    OUT: for(int chas = 0; chas < 7; chas++){
      for(int minut = 0; minut < 60; minut++){

        for(int sec = 0; sec < 60; sec++){
          System.out.println(chas + ":" + minut + ":" + sec);

          if(sec * chas > minut){
            break;
          }
          if(chas > 1 && minut%10 ==0 && minut != 0){
            break OUT;
          }
        }

      }
    }
  }

  public static void main(String[] args) {
    Vre();
  }
}
