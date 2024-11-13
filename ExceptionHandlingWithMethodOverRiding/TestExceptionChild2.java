package ExceptionHandlingWithMethodOverRiding;

class Parent{
    public void method() throws Exception{
        System.out.println("Parent method");
    }
}

public class TestExceptionChild2 extends Parent{
    public void method() throws Exception{
        System.out.println("Child method");
    }

    public static void main(String[] args) {
        Parent obj=new TestExceptionChild2();
        try {
            obj.method();
        } catch (Exception e) {
        }
    }
}
