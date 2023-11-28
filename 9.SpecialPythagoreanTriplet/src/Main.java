public class Main {
    public static void main(String[] args) {
        int sum = 1000;

        for (int a = 1; a < sum / 3; a++) {
            for (int b = a + 1; b < sum / 2; b++) {
                int c = sum - a - b;

                if (a * a + b * b == c * c) {
                    System.out.printf("%d² + %d² = %d²\n", a, b, c);
                    System.out.printf("%d + %d = %d\n", a * a, b * b, c * c);
                    System.out.printf("%d + %d + %d = %d\n", a, b, c, a + b + c);
                    System.out.printf("%d * %d * %d = %d\n", a, b, c, a * b * c);
                }
            }
        }
    }
}
