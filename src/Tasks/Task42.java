//семья 2деда, 2 бабушки, мама, папа, 3 детей
package Tasks;

import java.util.*;

public class Task42 {

    public static void main(String[] args) {
        ArrayList<Human> d = new ArrayList<>();
        Human ch1 = new Human("ch1", true, 20, d);
        Human ch2 = new Human("ch2", true, 17, d);
        Human ch3 = new Human("ch3", false, 15, d);

        ArrayList<Human> ch = new ArrayList<>();
        ch.add(ch1);
        ch.add(ch2);
        ch.add(ch3);
        Human f = new Human("father", true, 45, ch);
        Human m = new Human("mother", false, 43, ch);

        ArrayList<Human> m1 = new ArrayList<>();
        m1.add(m);
        ArrayList<Human> f1 = new ArrayList<>();
        f1.add(f);
        Human d1 = new Human("ded1", true, 70, m1);
        Human d2 = new Human("ded2", true, 72, f1);
        Human b1 = new Human("baba1", false, 65, m1);
        Human b2 = new Human("baba2", false, 63, f1);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(m);
        System.out.println(f);
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);
    }

    public static class Human {

        private String name;
        private boolean sex;
        private int age;
        private ArrayList<Human> children = new ArrayList<>();

        Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
