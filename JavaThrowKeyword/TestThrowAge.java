package JavaThrowKeyword;

public class TestThrowAge {
    public static void validate(int age){
        if(age<18){
            throw new ArithmeticException("Age is less than 18 person can't be eleigible to vote");
        }
        else{
            System.out.println("Person is eligible to vote");
        }
    }

    public static void main(String[] args) {
        validate(15);
        System.out.println("rest of the code");
    }
}
