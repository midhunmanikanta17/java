import java.util.*;
class CodeChecking
{
    String name;
    int len;
    Scanner sc=new Scanner(System.in);
    void Create()
    {
        System.out.println("Enter the code name: ");
        name=sc.nextLine();
        len=name.length();
        Checklen();
        Checkx();
        CheckStart();
    }
    void Checklen()
    {
        while(len<=6)
        {
            System.out.println("INVALID CODENAME!!");
            System.out.println("The length of the codename should be greater the 6......");
            Create();   
        }
    }
    void Checkx()
    {
        if(name.charAt(len-1)!='X' &&name.charAt(len-1)!='x')
        {
            System.out.println("\n INVLID CODENAME!!");
            System.out.println("The code name should end with x....");
            Create();
        }
    }
    void CheckStart()
    {
        if(!name.startsWith("Agent")&&!name.startsWith("agent"))
        {
            System.out.println("\n The code name should start with 'Agent' or'agent'....");
            Create();
        }
    }
    void Checkequals(String x)
    {
        if(name.equals(x))
            System.out.println("CODE NAME CONFIRMED...");
        else
            System.out.println("CODE NAME MIS-MATCH!!");
    }
}
class CodeName
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        CodeChecking c1=new CodeChecking();
        c1.Create();
        System.out.println("Re-enter your code name for confirmation");
        String s=sc.nextLine();
        c1.Checkequals(s);
    }
}
