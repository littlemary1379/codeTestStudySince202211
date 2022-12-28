import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int n = 2;
        //String[] word = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        //String[] word = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
        String[] word = {"hello", "one", "even", "never", "now", "world", "draw"};

        int index = -1;
        int[] answer = {0, 0};

        for (int i = 1; i < word.length ; i++) {
            if(Arrays.asList(word).indexOf(word[i]) != i) {
                System.out.println("중복");
                index = i;
                break;
            } else if(word[i - 1].charAt(word[i - 1].length() -1) != word[i].charAt(0)) {
                System.out.println("낱말 틀림");
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println(answer[0] + " " +answer[1]);
        } else {
            answer[0] = index % n + 1;
            answer[1] = index / n + 1;

            System.out.println(answer[0] + " " +answer[1]);
        }
    }
}