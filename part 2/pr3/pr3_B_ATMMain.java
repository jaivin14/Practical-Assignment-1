// Name : Savaliya Jaivin Pareshbhai
// ID : 21CE120

// Use the Account class created as above to simulate an ATM machine. Create 10 accounts  with id AC001.....AC010  with  initial balance 300₹. The system prompts the users to enter an id. If the id is entered incorrectly, ask the  user  to  enter  a  correct  id.  Once  an  id  is  accepted,  display  menu  with multiple choices. 
// 1.Balance inquiry
// 2.Withdraw money [Maintain minimum balance 300₹]
// 3.Deposit money
// 4.Money Transfer
// 5.Create Account
// 6.Deactivate Account
// 7.Exit 
// Hint: Use ArrayList, which is can shrink and expand with compared to Array.

import java.util.ArrayList;
import java.util.Scanner;

public class pr3_B_ATMMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id1 = "";
        String id2 = ""; // for if we want transfer money to other
        boolean flag = true; // for looping
        int choice;
        double amt;
        // array list for 10 people's account.
        ArrayList<ATM> people = new ArrayList<ATM>(); 
        for (int i = 1; i <= 10; i++) {
            people.add(new ATM());
        }
        System.out.print("Enter Your Account Number : ");
        id1 = sc.next();

        // this method is used for finding particular ID in array-list
        int usrNumber = usrID(id1, people);

        while (flag) {
            // listing choice
            System.out.println();
            System.out.println("Make a choice......");
            System.out.println("1.Balance inquiry ");
            System.out.println("2.Withdraw money ");
            System.out.println("3.Deposit money");
            System.out.println("4.Money Transfer ");
            System.out.println("5.Create Account ");
            System.out.println("6.Deactivate Account");
            System.out.println("7.Exit ");
            choice = sc.nextInt();
            switch (choice) {
                // get method is used to access the member of array list at a particular index
                // (Here That index is received by userID() method and stored in userNumber.)
                case 1 : {
                    System.out.println("Account Number : " + id1);
                    System.out.println("Current Balance : " + people.get(usrNumber).getBlnc());
                    break;
                }
                case 2 : {
                    System.out.print("Enter Amount To Withdraw : ");
                    amt = sc.nextDouble();
                    people.get(usrNumber).withdraw(amt);
                    break;
                }
                case 3 : {
                    System.out.print("Enter Amount To Deposit : ");
                    amt = sc.nextInt();
                    people.get(usrNumber).deposit(amt);
                    break;
                }
                case 4 : {
                    System.out.print("Enter Account Number To Transfer Money1 :");
                    id2 = sc.next();
                    int u2 = userID(id2, people);
                    System.out.print("Enter Amount To Transfer : ");
                    amt = sc.nextInt();
                    people.get(usrNumber).MoneyTransfer(people.get(u2), amt);
                    break;
                }
                case 5 : {
                    people.add(new ATM());
                    System.out.println("Account Created Successfully.");
                    System.out.println("The New Account Number Is :" + people.get(people.size() - 1).getId());
                    break;
                }
                case 6 : {
                    people.remove(usrNumber);
                    System.out.println("Account Deleted Successfully.");
                    flag = false;
                    break;
                }
                case 7 :
                {
                    flag = false;
                    break;
                } 
                default : 
                {
                    System.out.println("Make a valid choice..");
                    break;
                }
            }
        }
    }
// for finding the account from the array list
    public static int usrID(String id1, ArrayList<ATM> people) {
        Scanner s = new Scanner(System.in);
        int usr = 10000;
        int i;
        for (i = 0; i < people.size(); i++) 
        {
            if (id1.equals(people.get(i).getId())) {
                usr = i;
                break;
            }
        }
        if (i == people.size()) 
        {
            System.out.println("No Such Account Exists.\nTry Again..");
            System.out.print("Enter your account id :");
            id1 = s.next();
            retursrID(id1, people);
        } 
        else 
        return usr;
    }
}