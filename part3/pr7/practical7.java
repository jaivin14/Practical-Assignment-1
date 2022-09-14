// Name : Savaliya Jaivin Pareshbhai
// ID : 21CE120

// Write a program that illustrates the significance of interface default method.

package part3.pr7;

interface TestInterface { // methods in java

    public void square(int a); // abstract method

    default void show() { // default method
        System.out.println("Default Method Executed");
    }
}

class practical7 implements TestInterface{
      // implementation of square abstract method
      public void square(int a) {
        System.out.println(a * a);
    }

    public static void main(String args[]) {
        practical7 p = new practical7();
        p.square(4);
        p.show(); // default method executed
        System.out.println("**THIS PROGRAM IS PREPARED BY DIVY_21CE134**");
    }
}
