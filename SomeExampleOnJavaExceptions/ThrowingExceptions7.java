import java.util.Scanner;

class InsufficientFundsException extends Exception{
    String message;

    public InsufficientFundsException(String message){
        this.message=message;
    }

    public String getMessage(){
        return message;
    }
}

public class ThrowingExceptions7 {
    static void withDraw(int amount) throws InsufficientFundsException{
        int balance=10000;
        if(amount>balance){
            throw new InsufficientFundsException("Withdrawing amount is more than the balance");
        }
        else{
            System.out.println("Amount is witdrawned");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount to withdraw");
        int amount=sc.nextInt();
        try{
            withDraw(amount);
        }
        catch(InsufficientFundsException e){
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
