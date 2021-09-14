import java.util.Scanner;

class Positive{

public static void main(String[] args)
{
int num;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number");
num=sc.nextInt();


if(num > 0 )
{
 System.out.println("positive");
 }

 else if (num < 0)
 {
System.out.println("Negative");
 }

else
{
System.out.println("Zero");

}

}
}