public class ArrayExample{
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.print("Array Elements: ");
        for (int i =0;i<numbers.length;i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        String[] names = {"Alice", "Bob", "Charlie", "David"};
        System.out.print("Array Names: ");
        for (int i=0;i<names.length;i++){
            System.out.print(names[i] + " ");        
        }
        System.out.println();
    }
}
