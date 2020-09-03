package different;

public class Diff_36 {
  public static void main(String[] args) {
    Mechenosec m1 = new Mechenosec("Mechen");
    System.out.println(m1.name);
    m1.swim();
    m1.eat();
    m1.sleep();
    Animal2 l2 = new Lev("Simba");
    System.out.println(l2.name);
    l2.eat();
    l2.sleep();
    Mammal mam1 = new Lev("Tim");
    mam1.speak();
    mam1.eat();
    mam1.sleep();
    mam1.run();
  }
}
 abstract class Animal2 {
    Animal2(String name) {
      this.name = name;
    }
    String name;
    abstract void eat();
   abstract void sleep();
  }
  abstract class Fish extends Animal2{
    Fish(String name){
      super(name);
      this.name = name;
    }
    void sleep(){
      System.out.println("Всегда интересно наблюдать, как спят рыбы");
    }
   abstract void swim();
  }
  class Mechenosec extends Fish{
    Mechenosec(String name){
      super(name);
      this.name = name;
    }
    void swim (){
      System.out.println("Меченосец красивая рыба, которая быстро плавает");
    }
    void eat(){
      System.out.println("Меченосец не хищная рыба и она ест рыбий корм");
    }
  }
  abstract class Bird extends Animal2 implements Speakable{
    Bird(String name){
      super(name);
      this.name = name;
    }
    abstract void fly();
    public void speak(){
      System.out.println(name + " sings");
    }
  }
  class Pingvin extends Bird{
    Pingvin(String name){
      super(name);
      this.name = name;
    }
    void eat(){
      System.out.println("Пингвин любит есть рыбу");
    }
    void sleep(){
      System.out.println("Пингвины спят прижавшись друг к другу");
    }
    void fly(){
      System.out.println("Пингвины не умеют летать");
    }
    public void speak(){
      System.out.println("Пингвины не умеют петь как соловьи");
    }
  }
  abstract class Mammal extends Animal2 implements Speakable{
    Mammal(String name){
      super(name);
      this.name = name;
    }
    abstract void run();
    abstract void eat();
    abstract void sleep();
  }
   class Lev extends Mammal{
    Lev(String name){
      super(name);
      this.name = name;
    }
    void eat(){
      System.out.println("Лев любит мясо");
    }
    void sleep(){
      System.out.println("Большую часть дня лев спит");
    }
    void run(){
      System.out.println("Лев не самая быстрая кошка");
    }

  }
  interface Speakable{
    default void speak(){
      System.out.println("Somebody speaks");
    }
  }


