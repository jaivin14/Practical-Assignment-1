// Name : Savaliya Jaivin Pareshbhai
// ID : 21CE120

// Write a program to create three threads ‘FIRST’, ‘SECOND’, ‘THIRD’. Set the
// priority of the ‘FIRST’ thread to 3, the ‘SECOND’ thread to 5(default) and the
// ‘THIRD’ thread to 7.

package Practical4;

public class pr4 {
    public static void main(String[] args) {
        FIRST first_obj = new FIRST();
        first_obj.setName("FIRST");

        SECOND second_obj = new SECOND();
        second_obj.setName("SECOND");

        THIRD third_obj = new THIRD();
        third_obj.setName("THIRD");

        first_obj.setPriority(3);
        second_obj.setPriority(5);
        third_obj.setPriority(7);

        first_obj.start();
        second_obj.start();
        third_obj.start();
        System.out.println("This Program is prepared by 21CE120_Jaivin");
    }
}

class FIRST extends Thread {
    public void run() {
        System.out.println("Priority of thread " + Thread.currentThread().getName() + " : "
                + Thread.currentThread().getPriority());
    }
}

class SECOND extends Thread {
    public void run() {
        System.out.println("Priority of thread " + Thread.currentThread().getName() + " : "
                + Thread.currentThread().getPriority());
    }
}

class THIRD extends Thread {
    public void run() {
        System.out.println("Priority of thread " + Thread.currentThread().getName() + " : "
                + Thread.currentThread().getPriority());
    }
}
