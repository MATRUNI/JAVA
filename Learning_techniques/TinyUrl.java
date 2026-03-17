// Problem 535

import java.util.HashMap;

public class TinyUrl {
    HashMap<String,String> map=new HashMap<>();
    HashMap<String,String> reverseMap=new HashMap<>();
    int count=1;
    public String encode(String longUrl) {
        if(!reverseMap.containsKey(longUrl))
        {
            String url="http://tinyurl.com/"+count;
            count+=1;
            map.put(url, longUrl);
            reverseMap.put(longUrl, url);
            return url;
        }
        return reverseMap.get(longUrl);
    }
    
    public String decode(String shortUrl) {
        return map.get(shortUrl);   
    }   
}