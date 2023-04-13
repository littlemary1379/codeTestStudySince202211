public class Main {
    public static void main(String[] args) {
        System.out.println(solution(10, 3));
        System.out.println(solution(64, 6));
    }

    /*
    * 풀이
    * 10인분마다 음료수를 하나씩 마신다.
    * 따라서, 양꼬치의 갯수(n)을 10으로 나누어 몫을 구하고, 그 몫을 음료수의 갯수 k에서 뺀다.
    * 양꼬치의 갯수 n에는 12000을 곱해서 양꼬치의 가격, 새로 나온 음료수 갯수 k에는 2000을 곱해 음료수의 가격을 구한다.
    * 양꼬치의 가격과 음료수의 가격을 뎌한다.
    * */

    /*
    * sudo code
    *
    * 음료수의 갯수 = 음료수의 갯수 - 양꼬치의 갯수 / 10
    * ((n / 10 ≤ k < 1,000) 이므로 예외처리를 하지 않는다.)
    * return 양꼬치의 갯수 * 12000 + 음료수의 갯수 * 2000
    *
    * */
    public static int solution(int n, int k) {

        k -= n / 10;
        return n * 12000 + k * 2000;
    }
}

