import java.util.Arrays;
import java.util.regex.*;;
class zero_SubString {
    public static void main(String[] args) {
        int a[]={0,0,0,2,0,0};
        String s=Arrays.toString(a);
        
        Pattern p=Pattern.compile("\\D");
        Matcher m=p.matcher(s);
        s=m.replaceAll("");
        int count=0;
        for(int i=1;i<s.length();i++)
        {
            p=Pattern.compile("(?=(0{"+i+"}))");
            m=p.matcher(s);
            count+=m.results().count();
        }
        System.out.println(count);
    }    
}
