package model.exceptions;

public class DepositErrorException extends RuntimeException{

    public DepositErrorException(String msg){
        super(msg);
    }
}
