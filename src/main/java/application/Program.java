package application;

import model.entities.*;
import model.exceptions.DepositErrorException;
import model.exceptions.TransferErrorException;
import model.exceptions.WithdrawErrorException;
import model.services.CheckingAccountService;
import model.services.SalaryAccountService;
import model.services.SavingsAccountService;
import model.services.StatementService;

import java.time.LocalDate;

public class Program {
    public static void main(String[] args){

        Account salary = new SalaryAccount(0001, "Fausto Jackson", 1500.00);
        Account checkings = new CheckingAccount(0001, "Fausto Jackson", 1500.00);
        Account checkings2 = new CheckingAccount(0002, "Michael Silva", 1500.00);
        Account savings = new SavingsAccount(0001, "Fausto Jackson", 1500.00);
        StatementService statementService = new StatementService();

        try {
            Double amount = 200.00;

            SalaryAccountService sas = new SalaryAccountService();
            sas.withdraw(amount,salary);
            statementService.addList(new BankingTransactionsAccount(salary.getNumber(), salary.getHolder(), salary.getBalance(), LocalDate.now(), "Withdraw", amount));
//            System.out.println("Balance = 1500 - 200: "+ salary.getBalance());
//            sas.deposit(300.0, salary);
//            sas.transfer(500.0, salary, checkings);
//
            CheckingAccountService cas = new CheckingAccountService();
            amount = 100.00;
            cas.deposit(amount, checkings);
            statementService.addList(new BankingTransactionsAccount(checkings.getNumber(), checkings.getHolder(), checkings.getBalance(), LocalDate.now(), "Deposit", amount));

//            System.out.println("Balance = 1500+200: "+checkings.getBalance());
            amount = 150.00;
            cas.withdraw(amount, checkings);
            statementService.addList(new BankingTransactionsAccount(checkings.getNumber(), checkings.getHolder(), checkings.getBalance(), LocalDate.now(), "Withdraw", amount));

//            System.out.println("Balance = 1500-200: "+checkings.getBalance());
//            cas.withdraw(1600.00, checkings);
            amount = 300.0;
            cas.transfer(amount, checkings, salary);
            statementService.addList(new BankingTransactionsAccount(checkings.getNumber(), checkings.getHolder(), checkings.getBalance(), LocalDate.now(), "Transfer", amount));

//            System.out.println("Account "+checkings.getNumber()+" Balance: "+checkings.getBalance());
//            System.out.println("Account "+salary.getNumber()+" Balance: "+salary.getBalance());
//            cas.transfer(1600.00, checkings, checkings2);
//
//            SavingsAccountService savas = new SavingsAccountService();
//            savas.deposit(200.0, checkings);
//            savas.withdraw(200.0, checkings);
//            savas.transfer(200.0, savings,checkings);

            statementService.showList();

        }
        catch (DepositErrorException e){
            System.out.println(e.getMessage());
        }
        catch (TransferErrorException e){
            System.out.println(e.getMessage());
        }
        catch (WithdrawErrorException e){
            System.out.println(e.getMessage());
        }
        finally {


        }
    }
}
