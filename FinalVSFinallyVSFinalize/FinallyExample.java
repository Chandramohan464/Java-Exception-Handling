package FinalVSFinallyVSFinalize;

public class FinallyExample {
    public static void main(String[] args) {
        try{
            System.out.println("Inside try block");
            int x = 10 / 0;
            System.out.println("Value of x: " + x);
        }
        catch(Exception e){
            System.out.println("Inside catch block");
            System.out.println("Exception caught: " + e.getMessage());
        }
        finally {
            System.out.println("Inside finally block");
            System.out.println("This will always execute");
        }
        System.out.println("rest of the code");
    }
}
