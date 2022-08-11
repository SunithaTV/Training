package JavaTraining.src.day5;

public class CurrentAccount {
    private boolean isCurrentAccount;


    public void setCurrentAccount(boolean currentAccount) {
        isCurrentAccount= currentAccount;
    }

    public  void transactionCharges(float amt) {
        System.out.println("charges are " +(amt*0.1)/100);
    }
}
