package JavaFinallyBlock;

public class TestFinallyBlock2 {
    public static void main(String[] args) {
        try {
            System.out.println("Inside try block");
            int x = 5 / 0;
        }
        catch(Exception e){
            System.out.println("Inside catch block");
            System.out.println(e);
        }
        finally{
            System.out.println("finally block is always executed");
        }
        System.out.println("Rest of the code");
    }
}
