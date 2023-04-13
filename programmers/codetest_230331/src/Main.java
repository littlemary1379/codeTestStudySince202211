import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Solution solution = new Solution();
        solution.solution(new int[]{3, 76, 24});
    }
}

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        int[] origin = emergency.clone();
        Integer[] wrapper = Arrays.stream(emergency).boxed().toArray(Integer[]::new);
        Arrays.sort(wrapper, Collections.reverseOrder());

        for(int i = 0; i < origin.length; i++) {
            int finalI = i;
            int findIndex = IntStream.range(0, wrapper.length)
                    .filter(j -> origin[finalI] == wrapper[j])
                    .findFirst()
                    .orElse(-1);

            answer[i] = findIndex + 1;
        }

        return answer;
    }
}