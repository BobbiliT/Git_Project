import java.util.Scanner;

public class count_vowel {
    public static void main(String[] args) {
        System.out.println("enter your name ");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        int count = 0;
        for(int i=0; i<name.length(); i++){
            char c = name.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                count++;
            }
        }
        System.out.println("total vowel count form given string -> "+count);
    }
}
