package JavaExceptionPropogation;

public class ExceptionPropogationSimple {
    void m(){
        //throw new java.io.IOException("device error");
    }

    void n(){
        m();
    }

    void p(){
        try{
            n();
        }
        catch(Exception e){
            System.out.println("Exception handled");
        }
    }

    public static void main(String[] args) {
        ExceptionPropogationSimple obj = new ExceptionPropogationSimple();
        obj.p();
        System.out.println("rest of the code");
    }
}
