public class ExceptionHierarchy5 {
    public static void main(String[] args) {
        try{
            String str=null;
            System.out.println(str.length());
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }
        catch(NullPointerException e){
            System.out.println("Null Pointer Exception");
        }
        catch(Exception e){
            System.out.println("Genric Exception");
        }
    }
}
