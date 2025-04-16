import java.util.Arrays;

public class Array_end_with_zeros {

    public static int[] endzero(int arr[]){
        int j = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }        
        }
        return arr;
    } 
    public static void main(String[] args) {
        int arr[] = {1,0,2,0,3,0,4,0,5,0};
        int arr1[]=Array_end_with_zeros.endzero(arr);
        System.out.println(Arrays.toString(arr1));
    }
}
