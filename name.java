import java.util.Scanner;

public class name {
    public static void main(String[] args) {
        System.out.println("enter your name ");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        String store = "";
        for(int i=0; i<name.length(); i++){
            int count = 0;
            for(int j=0; j<name.length(); j++){
                if(name.charAt(i)==name.charAt(j)){
                    count++;
                }
            }
            String ss = String.valueOf(name.charAt(i));
            if(!store.contains(ss)){
                store = store+name.charAt(i);
                System.out.println(name.charAt(i)+"="+count);
            }
        }
    }
}
