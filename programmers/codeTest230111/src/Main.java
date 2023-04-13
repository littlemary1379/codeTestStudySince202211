public class Main {
    public static void main(String[] args) {
        System.out.println(solution(15));
    }

    /**
     * 풀이
     * 모든 사람이 피자를 한 조각씩 먹기 위해서는, 피자 판의 갯수를 answer, 사람 수를 n이라 가정했을 때, answer * 7 >= n이 되어야 한다.
     * 죽, answer >= n / 7이 된다.
     * 그러나, answer은 반드시 정수여야만 하므로, n / 7을 올림한다.
     */

    /**
     * 수도코드
     * 올림(사람 수 / 7) 반환
     */

    public static int solution(int n) {
        return (int) Math.ceil((float)n / 7);
    }
}

