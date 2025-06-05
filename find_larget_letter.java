import java.util.*;

public class find_larget_letter {
    public static void main(String[] args) {
        System.out.println("enter your name ");
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for(char ch : name.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }
        char maxChar = name.charAt(0);
        int maxCount = 0;
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue()>maxCount||(entry.getValue()==maxCount&&entry.getKey()<maxChar)){
                maxChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        System.out.println(maxChar);
    }
}
