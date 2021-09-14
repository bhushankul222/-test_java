import java.util.Scanner;

class Div{

public static void main(String[] args)
{
int num;
Scanner sc= new Scanner(System.in);
System.out.println("Enter the no.");
num=sc.nextInt();

if(num%5==0 && num%11==0)
{
	System.out.println("This number is divisble bye 5 and 11");
}
else
{
	System.out.println("This number is not divisble bye 5 and 11");

}


}

}