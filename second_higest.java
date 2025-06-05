public class second_higest {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int higest = Integer.MIN_VALUE;
        int second_higest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>higest){
                second_higest = higest;
                higest = arr[i];
            }
            if(arr[i]<higest&&arr[i]>second_higest){
                second_higest = arr[i];
            }
        }
        System.out.println(second_higest);
    }   
}
