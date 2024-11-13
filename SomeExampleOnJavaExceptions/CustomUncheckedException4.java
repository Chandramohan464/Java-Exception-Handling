import java.util.Scanner;

public class CustomUncheckedException4 {

    static void NegativeNumberException(int num){
        if(num<0){
            throw new ArithmeticException("Negative Number");
        }
        else{
            System.out.println("Number is positive");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        try{
            NegativeNumberException(num);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
