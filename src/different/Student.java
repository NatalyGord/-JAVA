package different;

public class Student {
  int numStud;
  String name;
  String surname;
  int yearStudy;
  double averageMath;
  double averageEconomy;
  double averageLanguage;

  double averageGrade(double averageMath, double averageEconomy, double averageLanguage){
    return (averageMath + averageEconomy + averageLanguage)/3;
  }

}
class StudentTest{
  public static void main(String[] args) {
    Student st1 = new Student();
    st1.name = "Николай";
    st1.surname = "Петров";
    st1.numStud = 1;
    st1.yearStudy = 2;
    //st1.averageMath = 5;
    //st1.averageEconomy = 4.3;
    //st1.averageLanguage = 3.7;
    Student st2 = new Student();
    st2.name = "Виктория";
    st2.surname = "Иванова";
    st2.numStud = 2;
    st2.yearStudy = 1;
//    st2.averageMath = 4;
//    st2.averageEconomy = 3.3;
//    st2.averageLanguage = 4.7;
    Student st3 = new Student();
    st3.name = "Иван";
    st3.surname = "Огурцов";
    st3.numStud = 3;
    st3.yearStudy = 3;
/*
    st3.averageMath = 3.4;
    st3.averageEconomy = 5;
    st3.averageLanguage = 4.5;
*/
    System.out.println(st1.numStud + " " + st1.surname + " " + st1.name + " Год обучения: " + st1.yearStudy + " Средняя оценка: " + st1.averageGrade(5, 4.3, 3.7));
    System.out.println(st2.numStud + " " + st2.surname + " " + st2.name + " Год обучения: " + st2.yearStudy + " Средняя оценка: " + st2.averageGrade(4, 3.3, 4.7));
    System.out.println(st3.numStud + " " + st3.surname + " " + st3.name + " Год обучения: " + st3.yearStudy + " Средняя оценка: " + st3.averageGrade(3.4, 5, 4.5));
  }
}
