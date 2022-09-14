// Name : Savaliya Jaivin Pareshbhai
// ID : 21CE120

// WAP that illustrate the interface inheritance. Interface P is extended by P1 
// and P2 interfaces.
// Interface P12 extends both P1 and P2. Each interface declares one method 
// and one constant. Create one class that implements P12. By using the 
// object of the class invokes each of its method and displays constant.

package part3.pr3;

interface P {
    void ifP();
}

interface P1 extends P {
    void ifP1();
}

interface P2 extends P {
    void ifP2();
}

interface P12 extends P1, P2 // entends p1 and p2 interface..
{
    void ifP12();
}

class invoke implements P12 {
    public void ifP() {
        System.out.println("Interface P is called");
    }

    public void ifP1() {
        System.out.println("Interface P1 is called");
    }

    public void ifP2() {
        System.out.println("Interface P2 is called");
    }

    public void ifP12() {
        System.out.println("Interface P12 is called");
    }
}

public class practical3 {
    public static void main(String args[])
    {
        invoke i = new invoke();
        i.ifP();
        i.ifP1();
        i.ifP2();
        i.ifP12();
        System.out.println(" THIS PROGRAM IS PREPARED BY 21CE120_Jaivin ");
    }
}
