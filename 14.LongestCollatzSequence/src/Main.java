public class Main {
    public static void main(String[] args) {
        long max = 0;
        long maxNumber = 0;

        for (int i = 1000000; i > 1; i--) {
            long n = i;
            long index = 0;
            while (n > 1) {
                if (n % 2 == 0) {
                    n /= 2;
                } else {
                    n = 3 * n + 1;
                }
                index++;
            }

            max = Math.max(max, index);
            if (max == index){
                maxNumber = n;
            }
        }
        System.out.println(maxNumber);
    }
}
