package blogic;

import exceptions.InsufficientFundsException;
import exceptions.InvalidAmountException;

public class HemanthBank implements Bank {

    private double balance;

    @Override
    public void deposit(double amt) throws InvalidAmountException {
        if (amt <= 0) {
            throw new InvalidAmountException(amt + " is invalid amount");
        }

        balance = balance + amt;
    }

    @Override
    public double withdraw(double amt) throws InvalidAmountException, InsufficientFundsException {

        if (amt <= 0) {
            throw new InvalidAmountException(amt + " is invalid amount");
        }

        if (balance < amt) {
            throw new InsufficientFundsException("insufficient funds");
        }

        balance = balance - amt;

        return amt;
    }

    @Override
    public void balanceEnquiry() {

        System.out.println("Current balance: " + balance);
    }
}
