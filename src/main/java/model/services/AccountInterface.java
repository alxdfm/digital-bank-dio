package model.services;

import model.entities.Account;

public interface AccountInterface {

    void withdraw(Double amount, Account acc);
    void deposit(Double amount, Account acc);
    void transfer(Double amount, Account origin, Account acc);
}
