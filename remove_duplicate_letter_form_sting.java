import java.util.Scanner;

public class remove_duplicate_letter_form_sting {
    public static void main(String[] args) {
        System.out.println("enter your name ");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        char ch[] = name.toCharArray();
        for(int i=0; i<ch.length; i++){
            boolean result = false;
            for(int j=1+i; j<ch.length; j++){
                if(ch[i]==ch[j]){
                    result = true;
                }
            }
            if(!result){
                System.out.println(ch[i]);
            }
        }
    }
}
