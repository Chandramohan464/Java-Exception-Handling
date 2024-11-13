package NestedTryBlock;

public class NestedTryBlock2 {
    public static void main(String[] args) {
        try {
            try{
                try{
                    int[] a = {1,2,3,4};
                    System.out.println(a[5]);
                }
                catch(ArithmeticException e){
                    System.out.println(e);
                    System.out.println("inner 2nd try block");
                }
            }
            catch(ArithmeticException e1){
                System.out.println(e1);
                System.out.println("inner 1st try block");
            }
        }catch(ArrayIndexOutOfBoundsException e2){
            System.out.println(e2);
            System.out.println("Outer try block(main)");
        }
        catch(Exception e3){
            System.out.println(e3);
        }
    }
}
