	import java.util.*;
class MakeString
{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String n,t;
        StringBuilder sb=new StringBuilder();
        System.out.print("Enter the main String: ");
        n=sc.nextLine();
        System.out.print("Enter the sub-String  to be searched in the main String: ");
        t=sc.nextLine();
        int i=n.indexOf(t);
        if(i>=0){
            sb.append(n.charAt(i-1));
            sb.append(n.charAt(i+t.length()));
            System.out.println("The character just before and after of the given sub-String's first occurence is: "+sb.charAt(0) +" and "+ sb.charAt(1));   
        }
        else{
            System.out.println("The given sub-String does not occur in the main String ");
        }
    }
}
