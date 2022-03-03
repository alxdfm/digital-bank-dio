package model.entities;


public class SavingsAccount extends Account{


    public SavingsAccount() {
    }

    public SavingsAccount(Integer number, String holder, Double balance) {
        super(number, holder, balance);
    }

    @Override
    public Double taxValue() {
        return 0.0;
    }
}
