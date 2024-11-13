package JavaCustomExceptions;

class InvalidAgeException extends Exception{
    String message;

    public InvalidAgeException(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}

public class AgeCustomException {
    static void checkAge(int age) throws InvalidAgeException{
        if(age < 18){
            throw new InvalidAgeException("Age is less than 18");
        }
        else{
            System.out.println("Age is valid");
        }
    }

    public static void main(String[] args) {
        try{
            checkAge(22);
        }
        catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
