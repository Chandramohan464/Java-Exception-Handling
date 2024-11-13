package JavaThrowVSThrows;

public class TestThrow {
    public static void checkNum(int num){
        if(num<1){
            throw new ArithmeticException("Number is negative, cannot calculate square");
        }
        else{
            System.out.println("Square of the "+num+" is "+(num*num));
        }
    }

    public static void main(String[] args) {
        checkNum(-1);
        System.out.println("rest of the code");
    }
}
