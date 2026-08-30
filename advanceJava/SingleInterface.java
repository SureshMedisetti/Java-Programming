package advanceJava;


@FunctionalInterface
interface Add{
    int add(int i, int j);
}

class Addition implements Add{
    public int add(int i, int j){
        return i+j;
    }
}

public class SingleInterface {
    public static void main(String[] args) {

        // This is normal way
        Addition addition = new Addition();
        int result = addition.add(4, 5);
        System.out.println(result);

        //using labmda expressions
        Add adds= (i,j) -> i+j;
        System.out.println(adds.add(3, 4));
    }
}
