public class Main {
    public static void main(String[] args) {
        boolean found = false;
        long n = 1;
        while (!found){
            for (int i = 1; i <= 20; i++){
                if (n % i != 0){
                    found = false;
                    break;
                }
                found = true;
            }
            if (found){
                System.out.println(n);
            }
            n++;
        }
    }
}
