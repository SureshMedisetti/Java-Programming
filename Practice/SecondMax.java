public class SecondMax {
    public static void main(String[] args) {
        int[] arr = {22,37,88,39,87,99,90};
        int max = 0;
        int secondMax = 0 ;
        for(int i=0;i<arr.length;i++){
            if (arr[i] > max){
                secondMax = max;
                max = arr[i];
            }else 
                if(arr[i]<max && arr[i]>secondMax){
                secondMax = arr[i];
            }
        }
        System.out.println(secondMax);
    }
}
