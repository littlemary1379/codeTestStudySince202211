import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] d = {
                2,2,3,3
        };
        int budget = 10;
        int answer = 0;

        Arrays.sort(d);

        for (int i = 0; i < d.length; i++) {
            if(budget >= d[i]) {
                answer += 1;
                budget -= d[i];
            } else {
                System.out.println("finish : " + answer);
                return;
            }
        }

        System.out.println("finish : " + answer);

    }
}