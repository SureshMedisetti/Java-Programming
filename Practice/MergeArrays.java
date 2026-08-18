public class MergeArrays {
    public static void main(String[] args) {
        int arr1[] = {1,3,5,7};
        int arr2[] = {2,4,6,8};
        int mergeArr[] = new int[arr1.length + arr2.length];
        int i=0 , j=0 , k=0;

        while(i < arr1.length && j < arr2.length){
            if(arr1[i]<=arr2[j]){
                mergeArr[k++] = arr1[i++];
            }else{
                mergeArr[k++] = arr2[j++];
            }
        }

        while(i<arr1.length){
            mergeArr[k++] = arr1[i++];
        }
        while(j<arr2.length){
            mergeArr[k++] = arr2[j++];
        }
        System.out.println(java.util.Arrays.toString(mergeArr));
    }
}
