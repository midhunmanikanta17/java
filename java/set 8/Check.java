import java.util.*;
import java.lang.Math;
 interface Number {
    boolean iszero(int n);
    boolean ispositive(int n);
    boolean isnegative(int n);
    boolean isodd(int n);
    boolean iseven(int n);
    boolean isprime(int n);
    boolean isamstrong(int n);
}
class Verification implements Number
{
    public boolean iszero(int n)
    {
        if(n==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean ispositive(int n)
    {
        if(n>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean isnegative(int n)
    {
        if(n<0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean isprime(int n)
    {
        if(n>0)
        {
  int c=0;
            for(int i=1;i<n;i++)
            {
                if(n%i==0)
                {
                    c++;
                }
            }
            if(c==1)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }
    }
    public boolean iseven(int n)
    {
        if(n%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean isodd(int n)
    {
        if(n%2==1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean isamstrong(int n)
    {
        if(n<0)
        {
            n=n*(-1);
        }
        double c=0;
        int x=n;
        while(x>0)
        {
            int r=x%10;
            c++;
            x=x/10;
        }
        int y=n;
        double sum=0;
        while(y>0)
        {
            double r=y%10;
            sum= sum + Math.pow(r,c);
            y=y/10;
        }
        if(sum==n)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
class Check
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int a= scan.nextInt();
        Number obj = new Verification();
        if(obj.iszero(a))
        {
            System.err.println("number is zero ");
        }
       
        if(obj.ispositive(a))
        {
            System.err.println("it is positive number ");
        }
      
        if(obj.isnegative(a))
        {
            System.err.println("it is negitive number");
        }
      
        if(obj.iseven(a))
        {
            System.err.println("it is even number");
        }
       
        if(obj.isodd(a))
        {
            System.err.println("it is odd number");
        }
       
        if(obj.isprime(a))
        {
            System.err.println("it is prime number");
        }
     
        if(obj.isamstrong(a))
        {
            System.err.println("number is amstrong number ");
        }
        
    }
}
