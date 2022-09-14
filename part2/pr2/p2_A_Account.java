// this is the supportive class file for the pr2_B

import java.util.Date;

class p2_A_Account {
    private int id;
    private double blnc;
    private double annualInterestRate;
    private Date dateCreated;

    //Default Constructor.
    public p2_A_Account() {
        id = 0;
        blnc = 500;
        annualInterestRate = 7;
        dateCreated = new Date();
    }

    //Parameterized constructor.
    public p2_A_Account(int id, double blnc) {
        this.id = id;
        this.blnc = blnc;
        dateCreated = new Date();
    }

    // Accesser and mutataor (getter - setter method)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getblnc() {
        return blnc;
    }

    public void setblnc(double blnc) {
        this.blnc = blnc;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    //Methoda to return Interest rate and interest.
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    public double getMonthlyInterest() {
        return blnc * annualInterestRate / 1200;
    }

    //method to withdraw amount from account.
    public void withdraw(double amt) {
        blnc-= amt;
        System.out.println(amt + " Rs. Withdrawn successfully.");
    }

    //method to deposit the amount.
    public void deposit(double amt) {
        blnc += amt;
        System.out.println(amt + " Rs. Deposited successfully.");
    }

    @Override
    public String toString() 
    {
        return "Account Details :\n" +
                "Id = " + id +"\n"+
                "Balance = " + blnc + "\n"+
                "Annual Interest Rate = " + annualInterestRate +"\n"+
                "Date of creation = " + dateCreated;
    }
}