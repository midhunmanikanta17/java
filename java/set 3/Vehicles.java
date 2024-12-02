import java .util.*;
class Automobile
{
   String Make;
   String Year_Model;
   double Milage;
   double Price;
   Automobile(String n,String y,double age,double p)
   {
    Make=n;
Year_Model=y;
    Milage=age;
    Price=p;
   }
   public String toString()
   {
     return "\n"+"Make="+Make+"\n"+"Year"+"/"+"Model="+Year_Model+"\n"+"Milage="+Milage+"\n"+"Price="+Price;
   }
}
class Cars extends Automobile
{
    Cars(String n,String y,double age,double p)
    {
    super(n,y,age,p);
    }
}
class Trucks extends Automobile
{
    Trucks(String n,String y,double age,double p)
    {
    super(n,y,age,p);
    }

}
class Vans extends Automobile
{
    Vans(String n,String y,double age,double p)
    {
    super(n,y,age,p);
    }

}
class Vehicles
{
    public static void main(String args[])
    {
    try
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose the vehicles \n 1.Cars\n 2.Trucks\n 3.Vans\n");
        int choice=sc.nextInt();
        System.out.println("\n Enter the company:");
        String n=sc.next();
        System.out.println("\n Enter the Year/Model:");
        String y=sc.next();
        System.out.println("\n Enter the Milage:");
        double age=sc.nextDouble();
        System.out.println("\n Enter the Price:");
        double p=sc.nextDouble();
        int k=Integer.parseInt(y.substring(0,4));
        if(k<=2000||k>=2030)
        {
            throw new NumberFormatException("Invalid");
        }
        switch(choice)
        {
            case 1: Cars c=new Cars(n,y,age,p);
                    System.out.println("\n Car Details:");
                    System.out.println(c);
                    break;
            case 2: Trucks t=new Trucks(n,y,age,p);
                    System.out.println("\n Truck Details:");
                    System.out.println(t);
                    break;
            case 3: Vans v=new Vans(n,y,age,p);
                    System.out.println("\n Van Details:");
                    System.out.println(v);
                    break;
            default :System.out.println("Invalid choice");
                 break;

        }

    }
    catch(NumberFormatException e)
    {
        System.out.println("Invalid input parameter for Year/Model[since first four characters in the range of 2000-2030]");
    }
    }
}
