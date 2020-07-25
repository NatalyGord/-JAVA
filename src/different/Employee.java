package different;

public class Employee {
  int id;
  String surname;
  int age;
  double salary;
  String department;

  Employee(int a, String b, int c, double d, String f){
    id = a;
    surname = b;
    age = c;
    salary = d;
    department = f;

  }
  double salaryUp(){
    salary *= 2;
    return salary;
  }
}
class EmployeeTest{
  public static void main(String[] args) {
    Employee em1 = new Employee(1, "Dooo", 19, 15000,"Fin");
    em1.salaryUp();
    System.out.println(em1.id + " " + em1.surname + " зарплата: " + em1.salary);

    Employee em2 = new Employee(2, "Booo", 22, 18000,"Fin");
    em2.salaryUp();
    System.out.println(em2.id + " " + em2.surname + " зарплата: " + em2.salary);

  }
}
