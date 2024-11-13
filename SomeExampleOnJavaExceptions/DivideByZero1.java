import java.util.Scanner;

public class DivideByZero1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the denominator to be divided");
        int denominator=sc.nextInt();
        try {
            int res=100/denominator;
            System.out.println("After dividing by "+denominator+": "+res);
        } catch (Exception e) {
            e.printStackTrace();
        }
        sc.close();
    }
}
