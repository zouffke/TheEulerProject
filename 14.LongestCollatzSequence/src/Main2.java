public class Main2 {
    public static void main(String[] args) {
        int max = 0;
        int maxNumber = 0;
        int[] lengths = new int[1000000];

        for (int i = 2; i < 1000000; i++) {
            long n = i;
            int index = 0;
            while (n != 1 && n >= i) {
                if (n % 2 == 0) {
                    n /= 2;
                } else {
                    n = 3 * n + 1;
                }
                index++;
            }
            lengths[i] = index + lengths[(int) n];

            if (lengths[i] > max) {
                max = lengths[i];
                maxNumber = i;
            }
        }
        System.out.println(maxNumber);
    }
}