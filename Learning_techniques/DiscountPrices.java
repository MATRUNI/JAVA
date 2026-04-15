// Problem 2288
import java.util.ArrayList;

public class DiscountPrices {
    public static String discountPrices(String sentence, int discount) 
    {
        ArrayList <String> s=new ArrayList<>();
        int start=0;
        int n=sentence.length();
        boolean isValidPrice=true;
        for(int i=0;i<=n;i++)
        {
            char ch;
            if(i==n) ch=' ';
            else
            ch=sentence.charAt(i);

            if(ch==' ')
            {
                String word =sentence.substring(start, i);
                if(word.charAt(0)=='$' && word.length()>1 && isValidPrice)
                {
                    double originalPrice=Double.parseDouble((word.substring(1)));
                    originalPrice=originalPrice*(1-discount/100.0);
                    word="$"+String.format("%.2f", originalPrice);
                }
                s.add(word);
                start=i+1;
                isValidPrice=true;
            }
            else if(sentence.charAt(start)=='$'&& i>start && (ch<48 || ch>57))
            {
                isValidPrice=false;
            }
        }
        return String.join(" ", s);
    }
    public static void main(String[] args) 
    {
        String s="a $1b $2 3";
        System.out.println(discountPrices(s, 30));
        s="$ a b $";
        System.out.println(discountPrices(s, 30));
        s="$1$ $2$$3";
        System.out.println(discountPrices(s, 30));
        s="$100$ $200";
        System.out.println(discountPrices(s, 30));
        s="$9999999999999999999 is expensive";
        System.out.println(discountPrices(s, 30));
        s="price is $10 then $20a and then $30";
        System.out.println(discountPrices(s, 30));
    }
}
