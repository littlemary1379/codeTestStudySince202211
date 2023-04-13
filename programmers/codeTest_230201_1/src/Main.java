public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(5, 24);
    }
}

class Solution {

    /**
     * 풀이
     * 요일은 일주일마다 돌아가므로, 1월 1일과 해당 날짜 사이의 날짜 사이의 날짜 차이를 구한 후 나누어 나머지를 구하면 된다.
     * 나머지에 따라 요일이 달라지게 될 것이다.
     * 날짜 차이를 구하는 법은 지나간 월의 차이를 더하고, 아직 지나지 않은 달의 일을 더한다.
     * 예시처럼 5월 24일이라면, 1월 + 2월 + 3월 + 4월의 값을 더하고, 남은 5월이 24일을 더한다.
     * 주의점 : 윤년이므로 2월은 29일이다(윤년이 아니라면 28일), 1월부터 7월까지는 홀수가 31일인데, 8월부터 12월까지는 짝수가 31일이다.
     * */

    /**
     * 수도코드
     * 날짜값 = 0
     * 요일 = ""
     * (이 부분은 사실 while을 써도 무방하다 생각합니다)
     * for(1월부터 ~ 숫자 받은 달의 -1까지) {
     *     if((날짜가 7월과 같거나 작으면서 && 홀수라면) || (날짜가 7월보다 크면서 && 짝수라면)) {
     *         날짜값 += 31
     *     } else if(2월이라면) {
     *         날짜값 += 29
     *     } else {
     *         날짜값 += 30
     *     }
     * }
     *
     * 날짜값 += 받은 일 - 1
     * (1일부터 시작하므로, -1 해줘야 정확한 날짜 차이가 나옴.
     * 예를 들어 1월 2일이라 생각하면, -1 해줘야 정확하게 날짜 차이가 나오지 않겠는가?)
     *
     * switch(날짜값 % 7) {
     *     case 1 : 요일 = 토요일
     *     break;
     *     case 2 : 요일 = 일요일
     *     break;
     *     case 3 : 요일 = 월요일
     *     break;
     *     case 4 : 요일 = 화요일
     *     break;
     *     case 5 : 요일 = 수요일
     *     break;
     *     case 6 : 요일 = 목요일
     *     break;
     *     case 0 : 요일 = 금요일
     *     break;
     *     default : 요일 = 오류
     *     break;
     *}
     *
     * return 요일
     *
     * */
    public String solution(int a, int b) {
        String answer = "";
        int date = 0;

        for (int i = 1; i < a; i++) {
            if((i <= 7 && i % 2 == 1) || (i > 7 && i % 2 == 0)) {
                date += 31;
            } else if(i == 2) {
                date += 29;
            } else {
                date += 30;
            }
        }

        date += (b - 1);

        System.out.println(date);

        switch (date % 7) {
            case 0 : answer = "FRI";
                break;
            case 1 : answer = "SAT";
                break;
            case 2 : answer = "SUN";
                break;
            case 3 : answer = "MON";
                break;
            case 4 : answer = "TUE";
                break;
            case 5 : answer = "WED";
                break;
            case 6 : answer = "THU";
                break;
            default : answer = "Error";
            break;
        }

        System.out.println(answer);

        return answer;
    }
}