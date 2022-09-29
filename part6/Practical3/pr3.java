// Name : Savaliya Jaivin Pareshbhai
// ID : 21CE120

// Write a program to increment the value of one variable by one and display it after one
// second using thread using sleep() method.

package Practical3;

public class pr3 {
    public static void main(String[] args) {
        int var;
        for (var = 1; var <= 10; var++) {
            try 
            {
                Thread.sleep(1000);
            } 
            catch (InterruptedException e) 
            {
                System.out.println(e.getMessage());
            }
            System.out.print(var + " ");
            System.out.println("This Program is prepared by 21CE120_Jaivin");
        }
    }
}
