package JavaThrowVSThrows;

public class TestThrowAndThrows {
    
    public static void method() throws ArithmeticException{
        System.out.println("Inside method()");
        throw new ArithmeticException();
    }

    public static void main(String[] args) {
        try {
            method();
        } catch (ArithmeticException e) {
            System.out.println("Caught in main()");
        }
        System.out.println("Rest of the code");
    }
}
