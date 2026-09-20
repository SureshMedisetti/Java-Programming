package collections;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {
    public static void main(String[] args) {
        Map<Integer,String> students = new HashMap<>();
        students.put(1, "Suresh");
        students.put(2, "Raresh");
        students.put(3, "Naresh");

        System.out.println(students);
    }
}
