public class Main {
    public static void main(String[] args) {
        long l1 = 0;
        long l2 = 1;
        long l3 = 0;
        long sum = 0;

        while (l3 < 4000000) {
            l3 = l2 + l1;
            l1 = l2;
            l2 = l3;
            if (l3 % 2 == 0) {
                sum += l3;
            }
        }

        System.out.println(sum);
    }
}
