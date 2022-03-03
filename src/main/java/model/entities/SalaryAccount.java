package model.entities;

import java.time.LocalDate;

public class SalaryAccount extends Account{

    public SalaryAccount() {
    }

    public SalaryAccount(Integer number, String holder, Double balance) {
        super(number, holder, balance);
    }

    @Override
    public Double taxValue() {
        return 0.0;
    }
}
