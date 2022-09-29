// Name : Savaliya Jaivin Pareshbhai
// ID : 21CE120

// Generate 15 random numbers from 1 to 100 and store it in an int array. Write a program to
//  display the numbers stored at odd indexes by thread1 and display numbers stored at even
//  indexes by thread2.


package Practical2;

import java.util.*;

public class pr2 {
    public static void main(String[] args) {
        int[] ar = new int[15];
        //random elements in array
        for (int i = 0; i < 15; i++) {
            ar[i] = new Random().nextInt(100);
        }

        System.out.println("The array is : ");
        for (int i = 0; i < 15; i++) {
            System.out.print(ar[i]+" ");
        }

        System.out.println("\n\nStarting thread...");

        //thread for printing odd indexes of array
        Thread thread1 = new Thread(){
            public void run(){
                for (int i = 1; i < 15; i=i+2) {
                    System.out.println("Odd : "+ar[i]);
                }
            }
        };

        //thread for printing even indexes of array
        Thread thread2 = new Thread(){
            public void run(){
                for (int i = 0; i < 15; i=i+2) {
                    System.out.println("Even : "+ar[i]);
                }
            }
        };

        thread1.start();
        thread2.start();

        System.out.println("This Program is prepared by 21CE120-Jaivin");
    }
}