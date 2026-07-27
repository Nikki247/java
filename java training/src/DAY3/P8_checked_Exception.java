package DAY3;
import java.io.*;
public class P8_checked_Exception {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("file.txt");

        } catch (Exception e) {
            System.out.println("Exception handled!!");
        }
        finally {
            System.out.println("Exception finalized!!");
        }

    }
}
