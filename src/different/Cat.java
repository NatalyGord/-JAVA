//драка котов выигрывает тот у кого больше параметров больше
package different;

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
      int res = 0;
      int res2 = 0;
      if(this.age > anotherCat.age){
        res++;
      }
      else{
        if(this.age < anotherCat.age){
          res2++;
        }
      }
      if(this.weight > anotherCat.weight){
        res++;
      }
      else{
        if(this.weight < anotherCat.weight){
          res2++;
        }
      }

      if(this.strength > anotherCat.strength){
        res++;
      }
      else{
        if(this.strength < anotherCat.strength){
          res2++;
        }
      }
      if(res > res2){
        return true;
      }
      else return false;
    }
    public static void main(String[] args){
    }
}
