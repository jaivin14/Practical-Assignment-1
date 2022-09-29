// Name : Savaliya Jaivin Pareshbhai
// ID : 21CE120

// Write a program to create three threads ‘FIRST’, ‘SECOND’, ‘THIRD’. Set the
// priority of the ‘FIRST’ thread to 3, the ‘SECOND’ thread to 5(default) and the
// ‘THIRD’ thread to 7.
// wait() method is the part of thread class.
// use set and get priority methods.

package Practical5;

public class pr5 {
    public static void main(String[] args) {
        Mythread First = new Mythread();
        Mythread Second = new Mythread();
        Mythread Third = new Mythread();
        

//from this we can set the priority of a thread which should be executed first
//But if onther thread execution time is lesser then it will be executed first 
        First.setPriority(3);
        Second.setPriority(5);
        Third.setPriority(7);

        First.start();
        Second.start();
        Third.start();
        System.out.println("This Program is prepared by 21CE120_Jaivin");
    }
}


class Mythread extends Thread
{
    public void run()
    {
        A();
        System.out.println("priority of this thread is : "+Thread.currentThread().getPriority());
        
        //it will return currrentlly running thread priority given by the user 
    }
    public synchronized void A()
    {
        try
        {
            wait(5000); // threw this function thread will wait for 5 sec 
        }
        catch(InterruptedException e)
        {
            Thread.currentThread().interrupt();
            System.out.println("Thread interupted");
        }
    }
}