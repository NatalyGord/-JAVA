package Tasks;

public class Task34 {
    public static void main(String[] args) {
        Human d1 = new Human("Иван", true, 70);
        Human d2 = new Human("Гена", true, 73);
        Human b1 = new Human("Маша", false, 65);
        Human b2 = new Human("Люба", false, 63);
        Human m = new Human("Ната", false, 42, d1, b1);
        Human f = new Human("Леха", true, 43, d2, b2);
        Human s1 = new Human("Лев", true, 19, f, m);
        Human s2 = new Human("Витя", true, 13, f, m);
        Human s3 = new Human("Слава", true, 22, f, m);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(m);
        System.out.println(f);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;
        Human(String name, boolean sex, int age){
            this.name = name;
            this.age = age;
            this.sex = sex;
        }
        Human(String name, boolean sex, int age, Human father, Human mother){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.father = father;
            this.mother = mother;
        }
        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }
            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }
            return text;
        }
    }
}
