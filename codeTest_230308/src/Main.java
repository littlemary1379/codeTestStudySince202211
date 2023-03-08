public class Main {
    public static void main(String[] args) {
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        Solution.solution(5, arr1, arr2);
    }
}

class Solution {
    public static String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < arr1.length; i++) {
            String binaryString1 = Integer.toBinaryString(arr1[i]);
            String binaryString2 = Integer.toBinaryString(arr2[i]);

            String mapPasswordString1 = "0".repeat(n - binaryString1.length()) + binaryString1;
            String mapPasswordString2 = "0".repeat(n - binaryString2.length()) + binaryString2;

            String[] splitPassword1 = mapPasswordString1.split("");
            String[] splitPassword2 = mapPasswordString2.split("");

            for (int j = 0; j < splitPassword1.length; j++) {
                if (!(splitPassword1[j].equals(splitPassword2[j]) && splitPassword1[j].equals("0"))) {
                    splitPassword1[j] = "#";
                } else {
                    splitPassword1[j] = " ";
                }
            }

            String arrayToString = String.join("", splitPassword1);
            answer[i] = arrayToString;

        }

        return answer;
    }
}