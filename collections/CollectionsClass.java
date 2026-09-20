package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsClass {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(9);
        nums.add(3);
        nums.add(4);
        nums.add(7);

        Collections.sort(nums);

        for(Integer n : nums){
             System.out.println(n);
        }
    }
}
