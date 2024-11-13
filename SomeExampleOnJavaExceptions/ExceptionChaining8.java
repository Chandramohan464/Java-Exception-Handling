import java.io.*;

public class ExceptionChaining8 {
    static void fileReader() throws IOException{
        throw new IOException("Device Error");
    }

    public static void main(String[] args) {
        try{
            fileReader();
        }
        catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
