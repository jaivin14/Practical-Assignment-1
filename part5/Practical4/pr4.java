// Name : Savaliya Jaivin Pareshbhai
// ID : 21CE120

//

package part5.Practical4;

import java.io.*;
// import java.util.*;

public class pr4 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("InputFile.jpg");
            fos = new FileOutputStream("OutputFile.jpg");

            int temp;

            while ((temp = fis.read()) != -1) {
                fos.write(temp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
