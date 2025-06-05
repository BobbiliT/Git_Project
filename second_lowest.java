public class second_lowest {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int lowest = Integer.MAX_VALUE;
        int second_lowest = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<lowest){
                second_lowest = lowest;
                lowest = arr[i];
            }
            if(arr[i]>lowest&&arr[i]<second_lowest){
                second_lowest = arr[i];
            }
        }
        System.out.println(second_lowest);
    }
}
