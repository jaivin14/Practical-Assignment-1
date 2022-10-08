// Name : Savaliya Jaivin Pareshbhai
// ID : 21CE120

/*
*  When to use Byte Stream over Character Stream?
* -> When we want to read/write bytes from/to a file, we use Byte Stream.
*/


package part5.Practical2;

import java.io.*;
public class pr2_B {
    // Main driver method
    public static void main(String[] args)
            throws IOException {
        // Initially assigning null ot objects for
        // reading and writing to file
        FileInputStream sourceStream = null;
        FileOutputStream targetStream = null;

        // Try block to check for exceptions
        try {

            // Passing the files via local directory
            sourceStream = new FileInputStream("D:\\Programming\\Programs\\Java_Laboratory_Manual\\PART-5\\Pr_5_2.txt");
            targetStream = new FileOutputStream(
                    "D:\\Programming\\Programs\\Java_Laboratory_Manual\\PART-5\\Pr_5_2_copy.txt");

            // Reading source file and writing content to
            // target file byte by byte
            int temp;

            // If there is content inside file
            // than read
            while ((temp = sourceStream.read()) != -1)
                targetStream.write((byte) temp);

            // Display message for successful execution of program
            System.out.print("Program successfully executed");
        }

        // finally block that executes for sure
        // where we are closing file connections
        // to avoid memory leakage
        finally {

            if (sourceStream != null)
                sourceStream.close();

            if (targetStream != null)
                targetStream.close();
        }
    }

}
