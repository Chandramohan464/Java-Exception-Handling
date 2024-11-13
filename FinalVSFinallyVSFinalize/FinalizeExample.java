package FinalVSFinallyVSFinalize;

public class FinalizeExample {
    public static void main(String[] args) {
        FinalizeExample f=new FinalizeExample();

        System.out.println("Hash code is: "+f.hashCode());

        f=null;

        System.gc();

        System.out.println("End of the Garbage collection");
    }

    protected void finalize(){
        System.out.println("Finalize method() is called");
    }
}
