import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String:");
        String s=sc.nextLine();
        HashMap<Character,Integer> map=new HashMap<>();
        sc.close();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(!map.containsKey(ch))
            {
                map.put(ch, 0);
            }
            map.put(ch, map.get(ch)+1);
        }
        char w=' ';
        for(Map.Entry<Character,Integer> entry:map.entrySet())
        {
            if(entry.getValue() == 1)
            {
                w=entry.getKey();
                break;
            }
        }
        if(w==' ')
        {
            System.out.println("-1");
        }
        else
        {
            System.out.println(w);
        }
    }
}