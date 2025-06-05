import java.util.Scanner;

public class find_nth {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println("enter your number ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        if(num>=0 && num<arr.length){
            System.out.println("index from a "+num+"="+arr[num]);
        }
        else{
            System.out.println("Invalid number! Index we must enter between 0 and "+(arr.length-1));
        }
    }
}
