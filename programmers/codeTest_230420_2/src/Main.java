import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("10 Z 20 Z"));
    }
}

class Solution {
    public int solution(String s) {
        int answer = 0;

        String[] array = s.split(" ");

        for(int i = 0; i < array.length; i ++) {
            if(array[i].equals("Z")) {
                answer -= Integer.parseInt(array[i - 1]);
            } else {
                answer += Integer.parseInt(array[i]);
            }
        }

        return answer;
    }
}