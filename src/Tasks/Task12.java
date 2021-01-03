//семья котов
package Tasks;

import java.io.*;

public class Task12 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String dedName = reader.readLine();
        Cat catDed = new Cat(dedName);

        String babName = reader.readLine();
        Cat catBab = new Cat(babName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, null, catDed);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catBab, null);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);


        System.out.println(catDed);
        System.out.println(catBab);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catDaughter);
        System.out.println(catSon);
    }

    public static class Cat {

        private String name;
        private Cat catMother;
        private Cat catFather;

        Cat(String name) {
            this.name = name;
        }
        Cat(String name, Cat catMother, Cat catFather) {
            this.name = name;
            this.catMother = catMother;
            this.catFather = catFather;
        }
        @Override
        public String toString() {
            if (catMother == null && catFather == null) {
                return "The cat's name is " + name + ", no mother, no father ";
            }
            else if (catFather == null) {
                return "The cat's name is " + name + ", mother is " + catMother.name + ", no father ";
            }
            else if (catMother == null) {
                return "The cat's name is " + name + ", no mother, father is " + catFather.name;
            }
            else {
                return "The cat's name is " + name + ", mother is " + catMother.name + ", father is " + catFather.name;
            }
        }
    }
}
