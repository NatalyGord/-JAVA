package different;

public class BankAccount {
  int id;
  double balance;

  double popolnenieScheta(double sum1){
    balance += sum1;
    return balance;
  }
  double spisanieSoScheta(double sum2){
    balance -= sum2;
    return balance;
  }
}
class BankTest{
  public static void main(String[]args){
    BankAccount b1 = new BankAccount();
    b1.balance = 10;
    b1.popolnenieScheta(12.3);
    System.out.println(b1.balance);
    b1.spisanieSoScheta(2.6);
    System.out.println(b1.balance);
  }
}
