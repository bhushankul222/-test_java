import java.util.Scanner;

class Alpha{

public static void main(String[] args)
{
char ch;
Scanner sc= new Scanner(System.in);
System.out.println("Enter the Character");
ch=sc.next().charAt(0);

if((ch>='A'  && ch<='Z') || (ch>='a' && ch<='z'))

{
System.out.println("character is alphabate");
 }
 else
{
System.out.println("character is not alphabate");
}
}
}