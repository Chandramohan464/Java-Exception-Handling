package JavaExceptionPropogation;

public class ExceptionPropogation {
    void m(){
        int x=10/0;
    }

    void n(){
        m();
    }

    void p(){
        try {
            n();
        } catch (Exception e) {
            System.out.println("Exception handled");
        }
    }

    public static void main(String[] args) {
        ExceptionPropogation obj=new ExceptionPropogation();
        obj.p();
        System.out.println("rest of code");
    }
}
