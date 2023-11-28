public class Main {
    public static void main(String[] args) {
        long l1 = 0;
        long l2 = 0;

        for (int i = 1; i <= 100; i++){
            l1 += i * i;
            l2 += i;
        }
        l2 = l2 * l2;

        System.out.printf("%d - %d = %d", l2, l1, l2 - l1);
    }
}
