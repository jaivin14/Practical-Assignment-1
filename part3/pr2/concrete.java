// Name : Savaliya Jaivin Pareshbhai
// ID : 21CE120

// Write a program to create a default method in an interface IPrinter. Create 
// an interface IPrinter and IScanner. You can assume variables and methods 
// for both interfaces. Create a concrete class to implement both the 
// interfaces. Create 5 objects of the class, store it in Vector and display the 
// result of the vector. 

package part3.pr2;

import java.util.*;

interface IPrinter //create a 1st interface..
{
    void IP(); //default method
}
interface IScanner //to create a 2nd interface..
{
    void IS(); //default methode
}

class temp implements IPrinter,IScanner
{
    public void IP()
    {
        System.out.println("IPrinter called");
    }
    public void IS()
    {
        System.out.println("IScanner called");
    }

}

public class concrete {
    public static void main(String args[])
    {
    Vector <temp> vt = new Vector<temp>(); // creating the vector for storing values
    for (int i = 0; i < 5; i++) {
        vt.add(new temp());
    }
    for (int i = 0; i < 5; i++)
    {
        vt.get(i).IS();
        vt.get(i).IP();
    }
    System.out.println(" THIS PROGRAM IS PREPARED BY 21CE120_Jaivin ");
    }
}
