package JavaTraining.src.day7;


public class CurrentAccount {
    int money;
    String accName;

    public  CurrentAccount(String accName, int money) {
        this.accName = accName;
        this.money= money;
      CurrentAccount ca=  new CurrentAccount("Man",1000);
        System.out.println(ca);
    }
}
