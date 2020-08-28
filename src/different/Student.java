//инкапсуляция
package different;

public class Student {
    private String name = "Нет";
    public StringBuilder getName(){
      StringBuilder sb = new StringBuilder(name);
      return sb;
    }
    public void setName(String s){
      if(s.length() >= 3) {
        name = s;
      }

    }
    private int course;
    public int getCourse(){
      return course;
    }
    public void setCourse(int i){
      if(i >0 && i <5) {
        course = i;
      }
    }
    private double grade;
    public double getGrade(){
      return grade;
    }
    public void setGrade(double i){
      if(i >= 1 && i <= 10) {
        grade = i;
      }
    }
    public static void showInfo(Student st1){
      System.out.println("Имя студента: " + st1.getName() + ",  Курс: " + st1.getCourse() + ", Оценка: " + st1.getGrade());
    }
  }
  class TestStudent{
    public static void main(String[] args) {
      Student st2 = new Student();
      st2.setName("Ivan");
      st2.setCourse(3);
      st2.setGrade(4.5);

      Student.showInfo(st2);
    }
  }

