package collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionInterface {
    public static void main(String[] args) {
        Collection<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(3);
        nums.add(9);
        nums.add(8);
        nums.add(4);

        System.out.println(nums);
    }
}
