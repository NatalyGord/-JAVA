package different;

public class Diff_34 {
  final static double PI = 3.14;

  public static int Proizv(int a, int b, int c) {
    System.out.println(a * b * c);
    return a * b * c;
  }

  static void Del(int a, int b) {
    System.out.println("Целое частное " + a / b + " Остаток " + a % b);
  }

  double AreaCircle(double radius) {
    return PI * radius * radius;
  }

  static double Circumference(double radius) {
    return 2 * PI * radius;
  }

  void Res(double radius) {
    System.out.println("Дано: радиус " + radius);
    System.out.println("Площадь круга равна: " + AreaCircle(radius));
    System.out.println("Длина окружности равна: " + Circumference(radius));
  }

}
  class Diff_34Test{
    public static void main(String[] args) {
      Diff_34.Proizv(2, 3, 1);
      Diff_34 d1 = new Diff_34();
      d1.Proizv(2, 3, 1);

      Diff_34.Del(26, 4);
      d1.Del(7, 4);

      d1.AreaCircle(5);
      Diff_34.Circumference(5);
      d1.Res(5);
  }
}
