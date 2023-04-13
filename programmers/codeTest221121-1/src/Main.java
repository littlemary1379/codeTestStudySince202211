import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        int[] nums = {3,3,3,2,2,2};

        int getMonNumber = nums.length/2;

        Map<Integer,Integer> map = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entrySet : map.entrySet()) {
            System.out.println(entrySet.getKey() + " : " + entrySet.getValue());
        }

        System.out.println(map.entrySet().size());

        if(map.entrySet().size() > getMonNumber) {
            System.out.println("mon number : " + getMonNumber);
        } else {
            System.out.println("map number : " + map.entrySet().size());
        }

    }
}