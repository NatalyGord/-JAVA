//наследование
package different;

public class Animal {
  int eyes;

  Animal(){
    System.out.println("I am animal");
  }
  public void eat(){
    System.out.println("Animal eats");
  }
  public void drink(){
    System.out.println("Animal drinks");
  }
}
class Pet extends Animal{
  String name;
  int tail = 1;
  int paw = 4;
  Pet(){
    System.out.println("I am pet");
    this.eyes = 2;
  }
  public void run(){
    System.out.println("Pet runs");
  }
  public void jump(){
    System.out.println("Pet jumps");
  }
}
class Dog extends Pet{
  Dog(String name){
    this.name = name;
    System.out.println("I am dog and my name is: " + name);
  }
  public void play(){
    System.out.println("Dog plays");
  }
}
class Cat1 extends Pet{
  Cat1(String name){
    this.name = name;
    System.out.println("I am cat and my name is: " + name);
  }
  public void sleep(){
    System.out.println("Cat sleeps");
  }
}
class Test{
  public static void main(String[] args) {
    Dog dog1 = new Dog("Bobik");
    System.out.println(dog1.paw);
    Cat1 cat1 = new Cat1("Vasy");
    cat1.sleep();

  }
}