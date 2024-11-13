package FinalVSFinallyVSFinalize;

public class FinalExampleTest {
    final int age=55;
    
    void display(){
        //age=65;
    }

    public static void main(String[] args) {
        FinalExampleTest f=new FinalExampleTest();
        f.display();
    }
}
