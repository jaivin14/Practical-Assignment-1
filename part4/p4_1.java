// Name : Savaliya Jaivin Pareshbhai
// ID : 21CE120

// WAP to show the try - catch block to catch the different types of exception.

class p4_1
{
    public static void main(String[] args) {
        try{
            int a  = 10;
            System.out.println("Value is : "+ a/0);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exception called");
        }

        try{    
            int[] abc = new int[3];
            System.out.println(abc[4]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBound Exception called");
        }

        try{    
            Object o = new Object();
            String s = (String)o; 

        }
        catch(ClassCastException e)
        {
            System.out.println("ClassCast Exception called");
        }

        try{    
            String s = null;
            if(s.equals("abcd"))
            {
                System.out.println("yes");
            } 
            else
            {
                System.out.println("no");
            }
        }
        catch(NullPointerException e)
        {
            System.out.println("NullPointer Exception called");
        }
            
        Thread t1 = new Thread(new Runnable() {
            public void run()
            {
                try {
                    Thread.sleep(-1);
                }
                catch (Exception e) {
                    System.out.println("IllegalArgument Exception called");
                    // e.printStackTrace();
                    // System.out.println("Dekh kya raha hai");
                }
            }
        });
            t1.setName("Test Thread");
            t1.start();

            try{    
                int[] abc = new int[-4];
                System.out.println(abc[4]);
            }
            catch(NegativeArraySizeException e)
            {
                System.out.println("NegetiveArraySize Exception called");
            }
    }
    
}