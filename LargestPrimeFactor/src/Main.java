public class Main {
    public static void main(String[] args) {
        long n = 600851475143L;
        boolean prime = true;

        for (long i = 2; i < n; i++){
            if (n % i == 0){
                for (long j = 2; j < i; j++){
                    if (i % j == 0) {
                        prime = false;
                        break;
                    }
                }
                if (prime){
                    System.out.println(i);
                }
            }
        }
    }
}
