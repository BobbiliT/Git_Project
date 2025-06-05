import java.util.Scanner;

public class find_nth {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println("enter your number ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        if(num>=0 && num<=arr.length-1){
            System.out.println(arr[num]);
        }
        else{
            System.out.println("enter between 0 and "+arr[num]);
        }
    }
}
