package collections;

import java.util.HashSet;
import java.util.Set;

public class SetInterface {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("Ajay");
        names.add("Suresh");
        names.add("krish");
        names.add("Suresh");
        names.add("Yash");
        names.add("krish");
        names.add("Suresh");

        System.out.println(names);
    }
}
