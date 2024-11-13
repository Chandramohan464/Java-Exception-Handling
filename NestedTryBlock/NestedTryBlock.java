package NestedTryBlock;

public class NestedTryBlock {
    public static void main(String[] args) {
        try {
            try {
                int x = 5 / 0;
            } catch (ArithmeticException e) {
                System.out.println(e);
            }
            try{
                int[] a=new int[5];
                a[5]=10;
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("ArrayIndexOutOfBoundsException");
            }
            System.out.println("other statement");
        }
        catch(Exception e){
            System.out.println("Outer try exception");
        }
        System.out.println("Continues");
    }
}
