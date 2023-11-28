import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        long trian = 0;
        int trianI = 1;
        int dividers = 0;

        while (true) {
            trian += trianI++;

            for (int i = 1; i <= trian; i++) {
                if (trian % i == 0) {
                    dividers++;
                }
            }

            System.out.printf("%d: %d", trian, dividers);

            System.out.println();

            if (dividers > 500) break;

            dividers = 0;
        }
    }
}
