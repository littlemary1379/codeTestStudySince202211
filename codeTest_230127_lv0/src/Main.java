public class Main {
    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(12));
        System.out.println(solution(11));
        System.out.println(solution(13));
    }

    /**
     * 풀이
     * 제안 받은 값의 모든 자릿수를 더한 값을 만든다.
     * 제안 받은 값에 모든 자릿수를 더한 값을 나눈다.
     * 나머지가 0이 된다면 true를 출력하고, 나머지가 0이 되지 않는다면 false를 반환한다.
     */

    /**
     * 수도코드
     * 자릿수 더한 값;
     * 자릿수 더하면서 변경될 값 = 입력받은 값;
     * while(자릿수 더하면서 변경될 값 > 0) {
     *     자릿수 더한 값 += 자릿수 더하면서 변경될 값 / 10 (여기서 가장 오른쪽의 값을 더하게 됨)
     *     자릿수 더하면서 변경될 값 /= 10 (10을 나눔으로써, 가장 오른쪽에 있는 값이 소수로 변하게 되고, int의 부동소수점 성격에 따라 버려짐)
     * }
     *
     * return ( 입력받은 값 % 자릿수 더한 값 == 0)
     *
     */

    public static boolean solution(int x) {

        int plusInt = 0;
        int digitInt = x;

        while(digitInt > 0){
            plusInt += digitInt % 10;
            digitInt /= 10;
        }

        return (x % plusInt == 0);
    }
}