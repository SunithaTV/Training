package JavaTraining.src.day7;

public class BusinessAccount extends CurrentAccount{

    public  void main(String[] args) {
        System.out.println(super.money);
    }
    public BusinessAccount(String accName, int money) {
        super(accName, money);

    }
}
