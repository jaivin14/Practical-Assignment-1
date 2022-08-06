// Name : Savaliya Jaivin Pareshbhai
// ID : 21CE120

// Aim : 
// Design a class named Account that contains:•A private int data field namedid for the account (default 0).
// •A private double data field named balance for the account (default 500₹).
// •A  private  double  data  field  named  annualInterestRate  that  stores  the  currentinterest rate (default 7%). Assume all accounts have the same interest rate.
// •A  private  Date  data  field  named  dateCreated  that  stores  the  date  when  theaccount was created.
// •A no-arg constructor that creates a default account.
// •A constructor that creates an account with the specified id and initial balance.
// •The accessor and mutator methods for id, balance, and annualInterestRate.
// •The accessor method for dateCreated.
// •A method named getMonthlyInterestRate() that returns the monthlyinterest rate.
// •A method named getMonthlyInterest() that returns the monthly interest.
// •A method named withdraw that withdraws a specified amount from theaccount.
// •A method named deposit that deposits aspecified amount to the account.

public class p2_B_AccountMain {
    public static void main(String[] args) {
        // creating the objects 
        p4_C_AccountCheck Check_object = new p4_C_AccountCheck(105,9000);
        p4_C_AccountSave Save_object = new p4_C_AccountSave(109,5000);
        System.out.println("\nBefore Withdrawing ....\n");
        System.out.println("\nAccount Details of checking object:");
        System.out.println(Check_object);
        System.out.println("\nAccount Details of saving object:");
        System.out.println(Save_object);

        // passing the withdraw money
        Check_object.withdraw(15000);
        Save_object.withdraw(8000); 
        
        System.out.println("\nAfter Withdrawing ....\n");
        System.out.println("\nAccount Details of checking object:");
        System.out.println(Check_object);
        System.out.println("\nAccount Details of saving object:");
        System.out.println(Save_object);
    }

}