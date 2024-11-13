package JavaThrowKeyword;

import java.io.*;

public class TestThrowFile {
    public static void method() throws FileNotFoundException{
        FileReader file=new FileReader("C:\\Users\\91886\\Desktop\\abc.text");
        BufferedReader fileReader=new BufferedReader(file);

        throw new FileNotFoundException();
    }
    public static void main(String[] args) {
        try {
            method();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("rest of the code");
    }
}
