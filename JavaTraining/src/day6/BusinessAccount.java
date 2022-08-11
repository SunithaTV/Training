package JavaTraining.src.day6;

import JavaTraining.src.day5.BankAccount;

public class BusinessAccount extends BankAccount {
    public BusinessAccount(int curbal, String name, int id) {
        super(curbal, name, id);
    }//this keyword- can call same class different constructor, can call other constructor from constructor
}
