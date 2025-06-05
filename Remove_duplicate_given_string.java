import java.util.Scanner;

public class Remove_duplicate_given_string {
    
    public static void main(String[] args) {
        System.out.println("enter your name ");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        char ch[] = name.toCharArray();
        for(int i=0; i<ch.length; i++){
            boolean result = false;
            for(int j=i+1; j<ch.length; j++){
                if(ch[i]==ch[j]){
                    result = true;
                }
            }
            if(result==false){
                System.out.println(ch[i]+" ");
            }
        }
    }
}
