import java.util.Arrays;

public class even_left_odd_rigth {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        int left = 0;
        int rigth = arr.length-1;
        while(left<rigth){
            while(arr[left]%2==0&&left<rigth){
                 left++;
            }
            while(arr[rigth]%2!=0&&left<rigth){
                rigth--;
            }
            if(left<rigth){
                int temp = arr[left];
                arr[left] = arr[rigth];
                arr[rigth] = temp;
                left++;
                rigth--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
