public class Main {
    public static void main(String[] args) {
        long sum = 2 + 3 + 5 + 7;

        for (int i = 2; i < 2000000; i++){
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
                boolean prime = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        prime = false;
                        break;
                    }
                }
                if (prime) {
                    sum += i;
                }
            }
        }
        System.out.println(sum);
    }
}
