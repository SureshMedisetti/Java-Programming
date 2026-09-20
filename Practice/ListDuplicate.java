import java.util.ArrayList;
import java.util.List;

public class ListDuplicate {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(4);
        nums.add(2);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(3);
        
        List<Integer> result = new ArrayList<>();
        
        System.out.print("Elements before removing duplicates :");
        for(Integer n : nums){
            System.out.print(" "+n);
        }
        System.out.println();
        
        for(Integer n : nums){
            if(!result.contains(n)){
                result.add(n);
            }
        }

        System.out.print("Elements after removing duplicates :");
        for(Integer n : result){
            System.out.print(" "+n);
        }
        System.out.println();
    }
}
