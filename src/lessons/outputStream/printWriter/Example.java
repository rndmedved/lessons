package lessons.outputStream.printWriter;
import java.io.File;
import java.io.PrintWriter;
public class Example {


        public static void main(String[] args) throws Exception {
//Data to write on Console using PrintWriter
            PrintWriter writer = new PrintWriter(System.out);
            writer.write("Welcome to Edureka!");
            writer.flush();
            writer.close();
//Data to write in File using PrintWriter
            PrintWriter writer1 =null;
            writer1 = new PrintWriter(new File("/home/medved/testOut.txt"));
            writer1.write("Learn different technologies.");
            writer1.flush();
            writer1.close();
        }
    }

