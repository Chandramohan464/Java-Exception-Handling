package JavaThrowKeyword;

class UserDefinedException extends Exception{
    public UserDefinedException(String message){
        super(message);
    }
}

public class TestThrowUserDefined {
    public static void main(String[] args) {
        try {
            throw new UserDefinedException("This is a custom exception");
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }
}
