public class NullPointerException {
    public static void main(String[] args) {
        String s = null;
    try{
        System.out.println(s.length());
        System.out.println("Rest of the code");
    }
    catch(Exception e){
        System.out.println(e);
    }
    }
}
