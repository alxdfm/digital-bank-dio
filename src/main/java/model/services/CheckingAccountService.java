package model.services;

import model.entities.Account;
import model.exceptions.TransferErrorException;
import model.exceptions.WithdrawErrorException;

public class CheckingAccountService implements AccountInterface{

    public CheckingAccountService() {
    }

    @Override
    public void withdraw(Double amount, Account acc) {
        double newbalance = acc.getBalance() - amount;
        if (newbalance > 0) {
            acc.setBalance(newbalance);
        } else
            throw new WithdrawErrorException("Withdraw error! Insufficient balance.");

    }

    @Override
    public void deposit(Double amount, Account acc) {
        acc.setBalance(acc.getBalance()+amount);
    }

    @Override
    public void transfer(Double amount, Account acc, Account destin) {
        double transference = acc.getBalance()-amount;
        if(transference > 0){
            acc.setBalance(transference);
            destin.setBalance(destin.getBalance()+amount);
        }
        else {
            throw new TransferErrorException("Transfer error! Insufficient balance.");
        }
    }
}
