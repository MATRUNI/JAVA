class lambdaExpression
{
    public static void main(String[] args) {
        lamb l = (a,b)->a * b;
        System.out.println(l.calc(12, 23));
    }
}

interface lamb{
    int calc(int a, int b);
}
