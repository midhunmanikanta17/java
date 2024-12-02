  package placements;
import java.io.*;
public class number_of_placements
{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public int year;
	public int placements;
	public void Read_data()throws IOException
	{    System.out.println("enter the year:");
		year=Integer.parseInt(br.readLine());
		System.out.println("enter the number of placements:");
		placements=Integer.parseInt(br.readLine());
	}
}
