public class missing_number {
    public static void main(String[] args) {
        int arr[] = {1,3,5,7,9};
        int diff = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=diff){
                while(diff<arr[i]-i){
                    System.out.println((diff+i)+" ");
                    diff++;
                }
            }
        }
    }
}
