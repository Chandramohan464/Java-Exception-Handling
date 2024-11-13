public class NumberFormatException {
    public static void main(String[] args) {
        String s="Abc";
        try {
            int i=Integer.parseInt(s);
            System.out.println("Value of i is "+i);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
