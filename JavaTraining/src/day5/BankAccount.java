package JavaTraining.src.day5;

public class BankAccount {
   int curbal=0;
    String name;
   int id;

    public BankAccount(int curbal, String name, int id) {
        this.curbal = curbal;
        this.name = name;
        this.id = id;
    }

    void deposit(float amt) {
        curbal+= amt;//addition is assignment operator
    }
    public void BankAccount1(float amt) {
        int curbal=0;
        curbal+= amt;//addition is assignment operator
    }
    public void TransactionCharges(float amt) {
        int curbal=0;
        curbal+= amt;
    }

}
