import java.util.Scanner;
public class fibonacci
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int a=0,b=1,c;
        System.out.println("fibonacci:"+a+""+b);
        for (int i=2;i<n;i++)
        {
            c=a+b;
            System.out.println(""+c);
            a=b;
            b=c;
        }
        sc.close();
     }
}