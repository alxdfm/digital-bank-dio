package model.entities;

import java.time.LocalDate;

public class CheckingAccount extends Account{

    public CheckingAccount() {
    }

    public CheckingAccount(Integer number, String holder, Double balance) {
        super(number, holder, balance);
    }

    @Override
    public Double taxValue() {
        return 6.5;
    }
}
