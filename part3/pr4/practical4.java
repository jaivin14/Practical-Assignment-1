// Name : Savaliya Jaivin Pareshbhai
// ID : 21CE120

// Develop a Program that illustrate method overriding concept.

package part3.pr4;
class Parent {
        protected void m2()
        {
        System.out.println("From parent m2()");
        }
    }

class Child extends Parent {
    @Override // overriding method
    public void m2()
    {
        System.out.println("From child m2()");
    }
}
    
public class practical4 {
    public static void main(String[] args)
    {
        Parent obj1 = new Parent();
        obj1.m2();
        Parent obj2 = new Child();
        obj2.m2();
        System.out.println(" THIS PROGRAM IS PREPARED BY 21CE120_Jaivin ");
    }
}
