public class Main {
    public static void main(String[] args) {
        long number;
        long max = 0;
        for (int i = 100; i <= 999; i++){
            for (int j = 100; j <= 999; j++){
                number = i * j;

                long temp = number;
                long reverse = 0;
                while(temp != 0)
                {
                    long remainder = temp % 10;
                    reverse = reverse * 10 + remainder;
                    temp = temp/10;
                }
                if (reverse == number){
                    max = Long.max(max, number);
                    System.out.printf("%d x %d = %d\n", i, j, number);
                }
            }
        }
        System.out.println(max);
    }
}
