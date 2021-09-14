import java.util.Scanner;

class Vow{

public static void main(String[] args)
{
char ch;
Scanner sc= new Scanner(System.in);
System.out.println("Enter the Character");
ch=sc.next().charAt(0);

if((ch=='A' || ch=='a' ||ch=='E' || ch=='e' || ch=='i' || ch=='I' || ch=='O' || ch=='o' || ch=='u' || ch=='U'))

{
System.out.println("character is Vowels");
 }
 else
{
System.out.println("character is consonent");
}
}
}