package by.gsu.lesson7;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

//      bin              text
// IN   InputStream      Reader
// OUT  OutputStream     Writer
public class BasicIOMain {
    public static void main(String[] args) throws IOException  {
        /*InputStream is = System.in;

        byte[] buffer = new byte[20];
        int result = is.read(buffer);

        OutputStream os = System.out;
        os.write(buffer);

//        System.out.println(result);
//        System.out.println(Arrays.toString(buffer));
*/
        Reader reader = new InputStreamReader(System.in);
        char[] cBuffer = new char[20];
        reader.read(cBuffer);

        System.out.println(Arrays.toString( cBuffer ));

        File file = new File("temp.txt");
        FileWriter writer = new FileWriter(file);
        writer.write(cBuffer);
        writer.flush();
        writer.close();
    }
}
