public class FindLargest {
    public static void main(String[] args) {
        int arr[] = {24,36,39,78,91,76};
        int max = 0;
        int min = arr[1];
        int avg = 0;
        int even = 0;
        int odd = 0;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
            if(min>arr[i]){
                min = arr[i];
            }
            avg += arr[i];
            if (arr[i] % 2 == 0){
                even++;
            }else{
                odd++;
            }
        }
        avg = avg/arr.length;
        System.out.println(max);
        System.out.println(min);
        System.out.println(avg);
        System.out.println(even);
        System.out.println(odd);
    }
}
