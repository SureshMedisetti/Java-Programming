public class Duplicates {
    public static void main(String[] args) {
        int arr[] = {1,1,2,3,2,2,3,3,4,5,5};
        for(int i=0;i<arr.length;i++){
            boolean checked = false;
            for(int k=0;k<i;k++){
                if(arr[i] == arr[k]){
                    checked = true;
                    break;
                }
            }
            if(!checked){
                int count = 0;
                for(int j=i+1;j<arr.length;j++){
                    if (arr[i] == arr[j]){
                        count++;
                    }
                }
                System.out.println(arr[i]+" Appeared Extra "+count+" Times");
            }
        }
    }
}
