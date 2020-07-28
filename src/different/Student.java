package different;

public class Student {
  int numStud;
  String name;
  String surname;
  int yearStudy;
  double averageMath;
  double averageEconomy;
  double averageLanguage;

  Student(int numStud1, String name1, String surname1, int yearStudy1, double averageMath1, double averageEconomy1, double averageLanguage1){
    numStud = numStud1;
    name = name1;
    surname = surname1;
    yearStudy = yearStudy1;
    averageMath = averageMath1;
    averageEconomy = averageEconomy1;
    averageLanguage = averageLanguage1;
    System.out.println("!");
  }
  Student(int numStud2, String name2, String surname2, int yearStudy2){
    this(numStud2, name2, surname2, yearStudy2, 0.0, 0.0, 0.0);
    System.out.println("часть параметров");
  }
  Student(){
    System.out.println("конструктор без параметров");
  }

  void averageGrade(Student st){
    System.out.println(st.numStud + " " + st.surname + " " + st.name + " Год обучения: " + st.yearStudy + " Средняя оценка: " + (st.averageMath + st.averageEconomy + st.averageLanguage)/3);
  }

}
class StudentTest{
  public static void main(String[] args) {
    Student st1 = new Student();
    st1.name = "Николай";
    st1.surname = "Петров";
    st1.numStud = 1;
    st1.yearStudy = 2;
    st1.averageMath = 5;
    st1.averageEconomy = 4.3;
    st1.averageLanguage = 3.7;
    Student st2 = new Student();
    st2.name = "Виктория";
    st2.surname = "Иванова";
    st2.numStud = 2;
    st2.yearStudy = 1;
    st2.averageMath = 4;
    st2.averageEconomy = 3.3;
    st2.averageLanguage = 4.7;
    Student st3 = new Student();
    st3.name = "Иван";
    st3.surname = "Огурцов";
    st3.numStud = 3;
    st3.yearStudy = 3;
    st3.averageMath = 3.4;
    st3.averageEconomy = 5;
    st3.averageLanguage = 4.5;

    st1.averageGrade(st1);
    st2.averageGrade(st2);
    st3.averageGrade(st3);


    Student stud = new Student();
    Student stud2 = new Student(10, "Ivan", "Petrov", 2);
    Student stud3 = new Student(10, "Ivan", "Petrov", 2, 4.5, 3.7, 4.2);
  }
}
