import java.util.Scanner;

class Upper{

public static void main(String[] args)
{
char ch;
Scanner sc= new Scanner(System.in);
System.out.println("Enter the Character");
ch=sc.next().charAt(0);

if(ch>='A'  && ch<='Z') 
{
	System.out.println("character is uppercase");
}
else if(ch>='a' && ch<='z')
{
	System.out.println("character is lowercase");
}

}
}