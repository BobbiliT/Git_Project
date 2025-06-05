import java.util.Scanner;

public class sub_reverse {
    public static void main(String[] args) {
        System.out.println("enter your name ");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        String word[] = name.split(" ");
        String rev = "";
        if(word.length>=1){
            String sub = word[0];
            for(int i=sub.length()-1; i>=0; i--){
                rev = rev+sub.charAt(i);
            }
        }
        System.out.println(rev);
    }
}
