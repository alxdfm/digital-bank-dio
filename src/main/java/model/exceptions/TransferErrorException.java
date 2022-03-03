package model.exceptions;

public class TransferErrorException extends RuntimeException{

    public TransferErrorException(String msg){
        super(msg);
    }
}
