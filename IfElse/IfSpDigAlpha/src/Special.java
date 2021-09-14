import java.util.Scanner;

class Special{

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
 else if(ch>='0' && ch<='9')
{
 System.out.println("character is digit");
}

else
{
System.out.println("character is special character");
}

}
}