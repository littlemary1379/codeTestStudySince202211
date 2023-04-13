import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(main.running());
    }

    public String running() {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        Arrays.sort(participant);
        Arrays.sort(completion);



        String answer = "";

        for (int i = 0; i < completion.length; i++) {
            System.out.println(participant[i]);
            System.out.println(completion[i]);
            System.out.println("");
            if(!completion[i].equals(participant[i])) {
                answer = participant[i];
                break;
            }
        }

        if(answer.equals("")) {
            answer = participant[participant.length-1];
        }

        return answer;
    }
}

