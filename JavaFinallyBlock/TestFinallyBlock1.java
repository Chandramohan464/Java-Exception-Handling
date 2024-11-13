package JavaFinallyBlock;

public class TestFinallyBlock1 {
    public static void main(String[] args) {
        try {
            int x=10/0;
        } catch (NullPointerException e) {
            System.out.println(e);
        }
        finally{
            System.out.println("finally block is always executed");
        }
        System.out.println("outer code");
    }
}
