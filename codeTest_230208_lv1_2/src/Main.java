public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(3, 20, 4));
    }

    /**
     * 풀이
     *
     * 놀이기구를 타고 싶은 만큼 반복하여 전체 금액 수를 더한다
     * 전체 금액에서 현재 가지고 있는 금액을 뺀다면, 모자란 금액을 구할 수 있다.
     * 근데 이 때, 전체 금액보다 현재 가지고 있는 금액이 크다면 0을 반환한다.
     * */

    /**
     * 수도코드
     *
     *  long 전체비용 = 0
     *  long 모자란비용 = 0
     *  for(i=1 부터 타고싶은 횟수까지) {
     *      전체비용 += 놀이기구 이용비용 * i
     *  }
     *
     *  if(전체비용이 가지고 있는 돈보다 크다면) {
     *      모자란 비용 = 전체비용 - 가진금액
     *  } else {
     *      모자란 비용 = 0
     *  }
     *
     *  return 모자란비용
     *
     * */

    public static class Solution {
        public long solution(int price, int money, int count) {

            long answer = 0;
            long totalPrice = 0L;

            for (int i = 1; i <= count; i++) {
                totalPrice += (long) price * i;
            }

            if(totalPrice - money > 0) {
                answer = totalPrice - money;
            } else {
                answer = 0;
            }

            return answer;
        }
    }

}

