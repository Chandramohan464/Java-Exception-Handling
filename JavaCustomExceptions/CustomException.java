package JavaCustomExceptions;

class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}

public class CustomException {
    static void validate(int age) throws InvalidAgeException{
        if(age<18){
            throw new InvalidAgeException("Invalid age,You can't vote");
        }
        else{
            System.out.println("You can vote");
        }
    }

    public static void main(String[] args) {
        try{
            validate(15);
        }
        catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
