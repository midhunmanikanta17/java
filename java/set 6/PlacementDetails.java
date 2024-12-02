import placements.number_of_placements;
import java.io.*;
class PlacementDetails
{public static void main(String args[])throws IOException
	{
	    try{
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("number of Years:");
		int n=Integer.parseInt(b.readLine());
		int total=0;
		number_of_placements[] pts=new number_of_placements[n];
		for(int i=0;i<n;i++)
		{
	      pts[i]=new number_of_placements();
		      System.out.printf("Year %d Details:",i+1);
		      pts[i].Read_data();
		}
		for(int i=0;i<n;i++)
		{
		      total=total+pts[i].placements;
		}
		System.out.printf("total no of placements %d",total);
	    }
	    catch(Exception e)
	    {
		System.out.println("Invalid input..");
	    }
	}
}
