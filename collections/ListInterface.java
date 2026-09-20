package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListInterface {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>();
        marks.add(79);
        marks.add(90);
        marks.add(87);
        marks.add(63);

        List<Integer> nums = new LinkedList<>();
        nums.add(10);
        nums.addLast(30);
        nums.addFirst(20);
        nums.add(3, 50);

        System.out.println(nums);
        System.out.println(marks);
    }
}
