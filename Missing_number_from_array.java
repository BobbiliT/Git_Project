
public class Missing_number_from_array {

    public static int[] missing(int arr[]){
        int diff = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=diff){
                while(diff<arr[i]-i){
                    System.out.println((i+diff)+" ");
                    diff++;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,5,7,9,10};
        int arr1[]=Missing_number_from_array.missing(arr);
      
    }
}
