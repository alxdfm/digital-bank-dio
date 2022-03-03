package model.entities;

import java.time.LocalDate;

public class BankingTransactionsAccount extends Account{

    private LocalDate date;
    private String type;
    private Double value;

    public BankingTransactionsAccount(){

    }

    public BankingTransactionsAccount(LocalDate date, String type, Double value) {
        this.date = date;
        this.type = type;
        this.value = value;
    }

    public BankingTransactionsAccount(Integer number, String holder, Double balance, LocalDate date, String type, Double value) {
        super(number, holder, balance);
        this.date = date;
        this.type = type;
        this.value = value;
    }

    public BankingTransactionsAccount(Integer number, String holder, Double balance, Double withdrawLimit, LocalDate date, String type, Double value) {
        super(number, holder, balance, withdrawLimit);
        this.date = date;
        this.type = type;
        this.value = value;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public Double taxValue() {
        return null;
    }

    @Override
    public String toString() {
        return  super.toString() + "\n" +
                "Type: " + type + "\n" +
                "Value: "+ value + "\n" +
                "Date: " +  date  + "\n";
    }
}
