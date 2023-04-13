import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //System.out.println(solution(5));
        //int[] primeSolution = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149};
        int[] primeSolution = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293, 307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409, 419, 421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, 487, 491, 499};
        System.out.println(primeSolution.length);
        System.out.println(solutionEratosthenes(100002));
    }

    public static int solution(int n) {

        ArrayList<Integer> resultArrayList = new ArrayList<>();

        for (int i = 2; i <= n; i++) {

            if (resultArrayList.size() == 0) {
                System.out.println("?????");
                resultArrayList.add(i);
            }

            for (int j = 0; j < resultArrayList.size(); j++) {
                if (i % resultArrayList.get(j) == 0) {
                    break;
                } else if (i % resultArrayList.get(j) != 0 && j == resultArrayList.size() - 1) {
                    resultArrayList.add(i);
                    System.out.println("add ? : " + i);
                }

            }

        }

        return resultArrayList.size();
    }

    public static int solutionEratosthenes(int i) {

        int answer = 0;

        ArrayList<Boolean> solutionArray = new ArrayList<>();
        System.out.println(solutionArray.size());

        solutionArray.add(0, false);
        solutionArray.add(1, false);

        for(int j = 2; j <= i; j ++) {
            solutionArray.add(j ,true);
        }

        for(int j = 2; j * j <= i; j ++) {
            if(solutionArray.get(j)) {
                for(int k = j * 2; k <= i; k += j) {
                    solutionArray.set(k, false);
                }
            }
        }

        for(int j = 0; j < solutionArray.size(); j ++ ) {
            if(solutionArray.get(j)) {
                answer += 1;
            }
        }

        System.out.println(solutionArray.size());

        return answer;
    }
}