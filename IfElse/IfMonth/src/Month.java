import java.util.Scanner;


class Month{

public static void main(String[] args)
{


int n;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of month");
n=sc.nextInt();

if(n==1)
{
 System.out.println("janurary=31 days");
}


else if(n==2)
{
	System.out.println("Feb=28 days");
}

else if(n==3)
{
	System.out.println("March=31 days");
}

else if(n==4)
{
	System.out.println("April= 30 days");
}

else if(n==5)
{
	System.out.println("May =31 days");
}

else if(n==6)
{
	System.out.println("june =30 days");
}

else if(n==7)
{
	System.out.println("july =31 days");
}
else if(n==8)
{
	System.out.println("Aug = 31 days");
}
else if(n==9)
{
	System.out.println("Sept =30 days");
}
else if(n==10)
{
	System.out.println("oct =31 days");
}
else if(n==11)
{
	System.out.println("Nov =30 days");
}
else if(n==7)
{
	System.out.println("Dec =31 days");
}



else
{
	System.out.println("invalid");
}
}
}