package different;

public class Time2 {
  public static void Vre(){
    int chas = 0;
    OUT:
    while(chas < 6){
      int minut = 0;
      do {
        if(chas > 1 && minut%10 ==0){
          break OUT;
        }
        int sec = 0;
        while (sec < 60) {
          if(sec * chas > minut){
            break;
          }

          System.out.println(chas + ":" + minut + ":" + sec);
          sec++;
        }
        minut++;
      }
      while(minut < 60);
      chas++;
    }
  }
  public static void main(String[] args) {
    Vre();
  }
}


