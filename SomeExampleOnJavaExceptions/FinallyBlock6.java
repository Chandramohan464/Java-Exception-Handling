import java.util.Scanner;

public class FinallyBlock6 {
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Denominator");
        int denominator=sc.nextInt();
        try{
            int res=100/denominator;
            System.out.println("Result is "+res);
        }
        catch(Exception e){
            System.out.println("Exception Caught"+e.getMessage());
        }
        finally{
            System.out.println("The division operation is complete");
        }
        sc.close();
    }
}
