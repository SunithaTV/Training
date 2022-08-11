package JavaTraining.src.day6;

public class BankingAccount {
    BankingAccount() {
        System.out.println("default");
    }
    BankingAccount(int type) {
        System.out.println("parameter");
    }

    int getInterest(){return 0;}
}
