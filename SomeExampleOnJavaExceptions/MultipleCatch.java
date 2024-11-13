public class MultipleCatch {
    public static void main(String[] args) {
        int[] a=new int[5];
        try{
            a[5]=10/0;
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds");
        }
        catch(Exception e){
            System.out.println("General Exception");
        }
        System.out.println("Rest of the code");
    }
}
