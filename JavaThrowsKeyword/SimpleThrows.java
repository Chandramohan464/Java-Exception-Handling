package JavaThrowsKeyword;

import java.io.*;

class M{
    void method() throws IOException{
        throw new IOException("Something went wrong");
    }
}

public class SimpleThrows {
    public static void main(String[] args) {
        try{
            M m = new M();
            m.method();
        }
        catch(Exception e){
            System.out.println("Caught exception");
        }
        System.out.println("rest code");
    }
}
