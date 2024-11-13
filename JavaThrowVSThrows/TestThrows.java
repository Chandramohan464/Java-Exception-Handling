package JavaThrowVSThrows;

public class TestThrows {
    public static int div(int m,int n) throws ArithmeticException{
        int div=m/n;
        return div;
    }

    public static void main(String[] args) {
        try {
            System.out.println(div(10, 0));
        } catch (Exception e) {
            System.out.println("Denominator is zero,cant divide Numirator with zero");
        }
    }
}
