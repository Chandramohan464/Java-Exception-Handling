import java.util.Scanner;

class InvalidAgeException extends Exception{
    String message;

    public InvalidAgeException(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}

public class CustomCheckedException3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=scanner.nextInt();
        try {
            checkAge(age);
        } catch (Exception e) {
            System.out.println("Invalid age: "+e.getMessage());
        }
        scanner.close();
    }

    static void checkAge(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Age should be greater than 18");
        }
        else {
            System.out.println("Age is valid");
        }
    }
}
