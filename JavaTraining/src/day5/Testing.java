package JavaTraining.src.day5;

public class Testing {
    public static void main(String[] args) {
        BankAccount account= new BankAccount(1,"",1);//Object created
        account.curbal=500;
        account.id=11;//Object and assign variables, create a method and pass as parameter, parameterised constructor
        account.name="TestAccount";
        account.deposit(20);
        System.out.println(account.curbal);

        //account.withdraw(50);
        System.out.println(account.curbal);
    }
}
