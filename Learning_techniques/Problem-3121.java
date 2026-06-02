import java.util.HashMap;

class abc 
{
    public int numberOfSpecialChars(String word) 
    {
        HashMap<Character,Integer> s = new HashMap<>();
        HashMap<Character,Integer> s1 = new HashMap<>();
        int result=0;

        for(int i=0;i<word.length();i++)
        {
            char ch=word.charAt(i);
            if(ch<97)
            {
                if(s.containsKey(ch)) continue;
                s.put(ch, i);
            }
            else
            {
                s1.put(ch, i);
            }
        }
        for(HashMap.Entry<Character,Integer> entity : s.entrySet())
        {
            char key=Character.toLowerCase(entity.getKey());
            if(s1.containsKey(key) && entity.getValue()<s1.get(key))
            {
                result+=1;
            }
        }
        return result;    
    }
}