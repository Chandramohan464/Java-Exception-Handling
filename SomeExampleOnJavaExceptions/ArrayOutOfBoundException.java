public class ArrayOutOfBoundException {
    public static void main(String[] args) {
        int[] array = new int[5];
        try {
            System.out.println(array[10]);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
