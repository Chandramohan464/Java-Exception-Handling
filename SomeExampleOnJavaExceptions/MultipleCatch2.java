public class MultipleCatch2 {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        }
        catch (Exception e) {
            System.out.println("Caught Exception");
        }//catch(ArrayOutOfBoundException e){
        //     System.out.println("Caught ArrayOutOfBoundException");
        // }
    }
}
