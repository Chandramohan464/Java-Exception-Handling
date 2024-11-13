package JavaFinallyBlock;

public class TestFinallyBlock {
    public static void main(String[] args) {
        try {
            int x = 25/5;
            System.out.println(x);
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("This is finally block");
        }
        System.out.println("Rest of the code");
    }
}
