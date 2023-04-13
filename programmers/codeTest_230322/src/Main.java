import javax.xml.transform.SourceLocator;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int answer = solution.solution(new String[]{"s", "o", "m", "d"}, new String[]{"moos", "dzx", "smm", "sunmmo", "som"});
        System.out.println(answer);
    }
}

class Solution {
    public int solution(String[] spell, String[] dic) {

        int answer = 2;

        for (String word : dic) {

            boolean match = true;

            for (String spellChar : spell) {
                if(!word.contains(spellChar)) {
                    match = false;
                    break;
                }
            }

            if(match) {
                answer = 1;
                break;
            }
        }
        return answer;
    }
}