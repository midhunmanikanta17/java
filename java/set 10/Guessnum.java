import java.util.Random;
import java.util.Scanner;
class Guessnum
{
   public static void main(String args[])
   {
     try
      {
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int arr1[]=new int[5];
        int rand=10000+r.nextInt(90000);
        int num=rand;
        for(int i=4;i>=0;i--)
        {
            arr1[i]=num%10;
            num=num/10;
        }
        int n,count,sum,f=0;            
        int arr2[]=new int[5];
        while(true)
        {
             System.out.println("Enter the guess number:");
             n=sc.nextInt();
             f++;
             while(n<10000||n>99999)
             {
                f++;
		System.out.println("Enter the guess number between 10000 and 99999");
                n=sc.nextInt();
                if(f==3)
                {
                   System.out.println("Guess number:" +rand);
                   throw new ArithmeticException("turns over");
                }
             }
             count=0;
             sum=0;
             for(int i=4;i>=0;i--)
             {
               arr2[i]=n%10;
               n=n/10;
             }
             for(int i=0;i<=4;i++)
             {
               if(arr1[i]==arr2[i])
                {
		  count++;
                  sum=sum+arr1[i];
                }
             }
             System.out.println(count+ "and "+sum);
             if(f==3)
             {
                   System.out.println("Guess number:" +rand);
                   throw new ArithmeticException("turns over");
             }
        }
    }
    catch(ArithmeticException e)
    {
       System.out.println("No.of guesses are over...");
    }
    catch(Exception e)
    {
      System.out.println("Exception :" +e);
    }
  }
}      

