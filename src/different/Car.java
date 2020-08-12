package different;

public class Car {
  String color;
  String motor;
  int door;
  Car(String color, String motor, int door){
    this.color = color;
    this.motor = motor;
    this.door =door;
  }

  void izmDoor(int a){
    door = a;
  }
  static void izmColor(Car a, Car b){
    String c = a.color;
    a.color = b.color;
    b.color = c;
  }
}
class CarTest{
  public static void main(String[] args) {
    Car c1 = new Car("red", "V6", 2);
    Car c2 = new Car("blue", "V4", 4);
    System.out.println(c1.color + " " + c1.motor + " " + c1.door);
    System.out.println(c2.color + " " + c2.motor + " " + c2.door);
    c1.izmDoor(5);
    c2.izmDoor(3);

    Car.izmColor(c1, c2);

    System.out.println(c1.color + " " + c1.motor + " " + c1.door);
    System.out.println(c2.color + " " + c2.motor + " " + c2.door);
  }
}
