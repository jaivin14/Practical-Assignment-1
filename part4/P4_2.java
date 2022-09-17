// Name : Savaliya Jaivin Pareshbhai
// ID : 21CE120

// Write a program to generate user defined exception using throw and throws keyword.

import java.util.*;
class MyException extends Exception
{
    public MyException()
    {}
    public MyException(String s)
    {
        super(s);
    }
}

class P4_2
{
    public static void main(String[] args) throws MyException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        if(n<6)
        {
            try{
                throw new MyException("Value is less than 6");
            } catch(MyException e)
            {
               System.out.println(e); 
            }
        }
    }
}