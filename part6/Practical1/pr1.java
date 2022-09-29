// Name : Savaliya Jaivin Pareshbhai
// ID : 21CE120

// Write a program to create thread which display “Hello World” message.
// by extending Thread class
// by using Runnable interface.

package Practical1;
// import java.util.*;

public class pr1 {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        t1.start();
        Thread t = new Thread(new Thread2());
        t.start();

        System.out.println("This Program is prepared by 21CE120-Jaivin");
    }
}

class Thread1 extends Thread {
    public void run() {
        System.out.println("Hello world" + " - This thread is extending Thread class");
    }
}

class Thread2 implements Runnable {
    public void run() {
        System.out.println("Hello world" + " - This thread is implementing Runnable interface");
    }
}