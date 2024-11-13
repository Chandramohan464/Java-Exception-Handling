package RealTime;

import java.util.Scanner;

class InvalidAgeException extends Exception{
    String message;

    InvalidAgeException(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}

class PoorDrivingRecordException extends Exception{
    String message;

    PoorDrivingRecordException(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}

class HealthIssueException extends Exception{
    String message;

    HealthIssueException(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}

public class PolicyApplication {
    static void validateAge(int age) throws InvalidAgeException{
        if(age < 18 || age > 65){
            throw new InvalidAgeException("Age must be between 18 and 65");
        }
    }

    static void validateDrivingHistory(boolean hasPoorDrivingHistory) throws PoorDrivingRecordException{
        if(hasPoorDrivingHistory){
            throw new PoorDrivingRecordException("You have a poor driving record");
        }
    }

    static void validateHealthRecords(boolean hasHealthProblems) throws HealthIssueException{
        if(hasHealthProblems){
            throw new HealthIssueException("You have health issues");
        }
    }

    void ProcessApplication(int age, boolean hasPoorDrivingHistory, boolean hasHealthProblems) throws InvalidAgeException,PoorDrivingRecordException,HealthIssueException{
        validateAge(age);
        validateDrivingHistory(hasPoorDrivingHistory);
        validateHealthRecords(hasHealthProblems);
        System.out.println("Application approved!");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Age: ");
        int age=sc.nextInt();
        System.out.println("Is person having Bad Driving Records? ");
        boolean hasPoorDrivingHistory = sc.nextBoolean();
        System.out.println("Is person having health issue? ");
        boolean hasHealthProblems = sc.nextBoolean();

        PolicyApplication application=new PolicyApplication();
        try{
            application.ProcessApplication(age, hasPoorDrivingHistory, hasHealthProblems);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
