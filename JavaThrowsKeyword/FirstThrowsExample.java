package JavaThrowsKeyword;

import java.io.*;

public class FirstThrowsExample {
    void m() throws IOException{
        throw new IOException("DEVICE ERROR");
    }

    void n() throws IOException{
        m();
    }

    void p(){
        try{
            n();
        }
        catch (IOException e){
            System.out.println("Caught IOException");
        }
    }

    public static void main(String[] args) {
        FirstThrowsExample obj=new FirstThrowsExample();
        obj.p();
        System.out.println("rest of code");
    }
}
