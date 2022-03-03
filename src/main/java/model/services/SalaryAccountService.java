package model.services;

import model.entities.Account;
import model.exceptions.DepositErrorException;
import model.exceptions.TransferErrorException;
import model.exceptions.WithdrawErrorException;

public class SalaryAccountService implements AccountInterface{

    public SalaryAccountService() {
    }

    @Override
    public void withdraw(Double amount, Account acc) {
        double newBalance = acc.getBalance()-amount;
        if(newBalance >= 0){
            acc.setBalance(newBalance);
        }
        else {
            throw new WithdrawErrorException("Insufficient balance!");
        }
    }

    @Override
    public void deposit(Double amount, Account acc) {
        throw new DepositErrorException("Deposit is not possible on this account type!");
    }

    @Override
    public void transfer(Double amount, Account acc, Account origin) {
        throw new TransferErrorException("Transfer is not possible on this account type!");
    }
}
