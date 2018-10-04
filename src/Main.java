public class Main
{
    public static void main(String[] args)
    {
        long x;
        x=mulDigits(12345678);
        System.out.println(x);



    }

    public static int mulDigits(long n)
    {
        long sum=0;
        while (n>0)
        {
            sum=sum+n%10;
            n=n/10;

        }
        return (int)sum;

    }

}
