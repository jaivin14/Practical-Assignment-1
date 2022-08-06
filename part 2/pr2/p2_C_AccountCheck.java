// this is the supportive class file for the pr2_B

public class p2_C_AccountCheck extends p2_A_Account {
    // Checking Account supports the overdraft
    // Let withdraw limit be 9000 Rs.
    // Let overdraft charge be 5%
    double od = 5000;
    double odc = 0.05;

    public p2_C_AccountCheck() {
    }
    public p2_C_AccountCheck(int id, double balance) {
        super(id, balance);
    }

    //overriding withdraw() method.
    public void withdraw(double money) {
        // condition for over drafting money
        if (getBalance() - money < -od) {
            super.withdraw(money); // parent class method to withdraw amount.
            setBalance(getBalance()-money*odc);
            System.out.println(money*odc+"Rs. charge is deducted from your account.");
        } else {
            System.out.println("Can't overdraft money more than " + od + " Rs.");
        }
    }
}