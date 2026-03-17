// import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.*;

class testing_Regex {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the limit of array:");

        int n=sc.nextInt();

        int arr []=new int[n];

        for(int i=0;i<n;i++)
        {
            System.out.print("Enter the "+(i+1)+":");
            arr[i]=sc.nextInt();
        }

        testing_Regex t=new testing_Regex();
        String s=t.array_To_String(arr);

        Pattern pattern=Pattern.compile("\\D");
        Matcher matcher=pattern.matcher(s);

        long a = matcher.results().count();
        System.out.println(s);
        s=matcher.replaceAll("");
        

        System.out.println(a);
        System.out.println(s);
        sc.close();
    }

    String array_To_String(int []a)
    {
        return Arrays.toString(a);
    }
}
