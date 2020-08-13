package different;

public class Month {
  void days(int month){
    switch(month){
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
        System.out.println("В 2015г в этом месяце 31 день");
        break;
      case 2:
        System.out.println("В 2015г в этом месяце 28 деней");
        break;
      case 4:
      case 6:
      case 9:
      case 11:
        System.out.println("В 2015г в этом месяце 30 деней");
        break;
      default:
        System.out.println("такого месяца нет");
    }
  }

  public static void main(String[] args) {
    Month mn1 = new Month();
    mn1.days(6);
  }
}
