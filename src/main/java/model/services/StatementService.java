package model.services;

import model.entities.BankingTransactionsAccount;

import java.util.ArrayList;
import java.util.List;

public class StatementService {

    private List<BankingTransactionsAccount> list;


    public StatementService() {
        this.list = new ArrayList<>();
    }

    public List<BankingTransactionsAccount> getList() {
        return list;
    }

    public void addList(BankingTransactionsAccount e){
        list.add(e);
    }

    public void showList(){
        for(BankingTransactionsAccount a : list){
            System.out.println(a);
        }
    }

    @Override
    public String toString() {
        return "Statement{" +
                "list=" + list +
                '}';
    }
}
