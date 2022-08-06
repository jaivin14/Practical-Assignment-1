// this is the supportive class file for the pr2_B

// // Name : Savaliya Jaivin Pareshbhai
// ID : 21CE120

// Aim :
// (Subclasses  of  Account)  In  Programming  Exercise  2,  the  Account  class  wasdefined to model a bank account. An account has the properties account number,balance,  annual  interestrate,  and  date  created,  and  methods  to  deposit  and withdrawfunds.  Create  two  subclasses  for  checking  and  saving  accounts.  A checkingaccount  has  an  overdraft  limit,  but  a  savings  account  cannot  be overdrawn.Draw  the  UML  diagram  for  the  classes  and  then implement  them. Writea  test  program  that  creates  objects  of  Account,  SavingsAccount,  andCheckingAccount and invokes their toString() methods.

public class p4_C_AccountSave extends p2_A_Account{
    // saving account doesn't support overdraft

    public p4_C_AccountSave() {
    }

    public p4_C_AccountSave(int id, double balance) 
    {
        super(id, balance);
    }

    public void withdraw(double money){
        if(money<=getBalance()){
            super.withdraw(money); // parent class method to withdraw amount.
        }
        else {
            System.out.println("You don't have sufficient balance to withdraw "+ money +" Rs.");
        }
    }
}