import java.util.Scanner;
class LeftRotate
{
    public static void main(String args[])
    {
        int[] a=new int[25];
        int i;
        Scanner input=new Scanner(System.in);
        System.out.println("enter size of array");
        int size=input.nextInt();
        System.out.println("enter the elements");
       
        for(i=0;i<size;i++)
        {
            a[i]=input.nextInt();
        }
        System.out.println("enter number of digits to be shifted");
        int n=input.nextInt();
        if(n>a.length)
        {
            System.out.println("enter correct number");
        }
        else
        {
            for(i=n;i<size;i++)
            {
                System.out.print(a[i]+"");
            }
            for(i=0;i<n;i++)
            {
                System.out.print(a[i]+"");
            }
        }
    }
}