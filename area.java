import java.util.Scanner;
class area
{
    public static void main(String args[])
    {
        calling c=new calling();
        c.call(new square());
        c.call(new rectangle());
        c.call(new circle());
    }
}

class calling 
{
    public void call(shape ref)
    {
        ref.input();
        ref.calculate();
        ref.display();
    }
}

class square extends shape
{
    float len;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the square:");
        len=sc.nextFloat();
    }
    void calculate()
    {
        area=len*len;
    }
    void display()
    {
        System.out.println("The Area of Square is: "+area);
    }
}

class rectangle extends shape
{
    float len, width;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle:");
        len=sc.nextFloat();
        System.out.print("Enter the Width of the rectangle:");
        width=sc.nextFloat();
    }
    void calculate()
    {
        area=len*width;
    }
    void display()
    {
        System.out.println("The Area of rectangle is: "+area);
    }
}

class circle extends shape
{
    double radius;
    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle:");
        radius=sc.nextFloat();
    }
    void calculate()
    {
        area=radius*(3.14);
    }
    void display()
    {
        System.out.println("The Area of circle is: "+area);
    }
}

abstract class shape
{
    double area;
    abstract void input();
    abstract void calculate();
    abstract void display();
}