public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Solution solution = new Solution();
        solution.solution(40);
    }
}

class Solution {
    public int solution(int n) {
        int answer = n;
        int whileInt = 1;


        while(whileInt <= answer) {
            if(whileInt % 3 == 0 || String.valueOf(whileInt).contains("3")) {
                System.out.println("whileInt ? " + whileInt);
                answer++;
            }

            whileInt++;
        }

        System.out.println("------------------------------");
        System.out.println("whileInt ? : " + whileInt);
        System.out.println("answer ? : " + answer);
        return answer;
    }
}