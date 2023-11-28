public class Main2 {
    public static void main(String[] args) {
        int n = 1;
        int numDivisors = 1;

        while (numDivisors <= 500) {
            n++;
            long triangle = (long) n * (n + 1) / 2;
            System.out.println(triangle);
            numDivisors = numDivisors(triangle);
        }

        long triangle = (long) n * (n + 1) / 2;
        System.out.println(triangle);
    }

    private static int numDivisors(long num) {
        int numDivisors = 1;
        int count;

        // Deal with powers of 2 first
        for (count = 0; num % 2 == 0; count++) {
            num /= 2;
        }
        numDivisors *= (count + 1);

        // Odd prime factors up to the square root
        for (long i = 3; i * i <= num; i += 2) {
            for (count = 0; num % i == 0; count++) {
                num /= i;
            }
            numDivisors *= (count + 1);
        }

        // If num > 1 then it is prime
        if (num > 1) {
            numDivisors *= 2;
        }

        return numDivisors;
    }
}