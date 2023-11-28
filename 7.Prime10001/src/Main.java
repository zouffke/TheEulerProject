public class Main {
    public static void main(String[] args) {
        int n = 0;
        long m = 2;

        while (n < 10001) {
            boolean prime = true;
            for (int i = 2; i < m; i++){
                if (m % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime){
                n++;
                System.out.printf("%d: %d\n", n, m);
            }
            m++;
        }

    }
}
