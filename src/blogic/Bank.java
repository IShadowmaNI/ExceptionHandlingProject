package blogic;

import exceptions.InsufficientFundsException;
import exceptions.InvalidAmountException;

public interface Bank {

    public void deposit(double amt) throws InvalidAmountException;

    public double withdraw(double amt) throws InvalidAmountException, InsufficientFundsException;

    public void balanceEnquiry();

}
