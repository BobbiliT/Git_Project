import java.util.Scanner;

public class sum_of_digits {
    public static void main(String[] args) {
        System.out.println("enter your name ");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        String num = "";
        int sum = 0;
        for(int i=0; i<name.length(); i++){
            char ch = name.charAt(i);
            if(Character.isDigit(ch)){
                num= num+ch;
            }
            else{
                if(!num.isEmpty()){
                    sum=sum+Integer.parseInt(num);
                    num= "";
                }
            }
        }
        if(!num.isEmpty()){
            sum=sum+Integer.parseInt(num);
        }
        System.out.println(sum);
    }
}
