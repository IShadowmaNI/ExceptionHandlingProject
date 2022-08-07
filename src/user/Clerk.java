package user;

import blogic.Bank;
import blogic.HemanthBank;
import exceptions.InsufficientFundsException;
import exceptions.InvalidAmountException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Clerk {

    public static void main(String[] args) {

        try {
            Bank acc = new HemanthBank();
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String option = "";
            do {
                try {
                    System.out.println("choose one option: ");
                    System.out.println("1.Deposit");
                    System.out.println("2.Withdraw");
                    System.out.println("3.Balance Enquiry");

                    System.out.println("Enter option: ");
                    option = br.readLine();

                    switch(option) {
                        case "1": {
                            System.out.println("Enter deposit amount: ");
                            String s = br.readLine();
                            double amt = Double.parseDouble(s);

                            acc.deposit(amt);
                            acc.balanceEnquiry();
                            break;
                        }
                        case "2": {
                            System.out.println("Enter withdraw amount: ");
                            String s = br.readLine();
                            double amt = Double.parseDouble(s);

                            double withdrawAmt = acc.withdraw(amt);
                            System.out.println("withdrawn amount: " + withdrawAmt);
                            acc.balanceEnquiry();
                            break;
                        }
                        case "3": {
                            acc.balanceEnquiry();
                            break;
                        }
                        default:
                            System.out.println("Invalid Option");
                    }
                } catch (InvalidAmountException e) {
                    System.out.println(e.getMessage());
                } catch (InsufficientFundsException e) {
                    System.out.println(e.getMessage());
                } catch (NumberFormatException e){
                    System.out.println("please enter only number");
                }
                System.out.println("Do you want to continue: (yes/no) ");
                option = br.readLine();
            } while (option.equalsIgnoreCase("yes"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
