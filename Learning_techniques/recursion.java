import java.util.Scanner;

class Recursion
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String: ");
        StringBuilder s=new StringBuilder(sc.nextLine());
        sc.close();
        s.reverse();
        System.out.println(s);
    }
}