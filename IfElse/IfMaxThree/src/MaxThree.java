import java.util.Scanner;

class MaxThree{

public static void main(String[] args)
{
int a=90,b=91,c=40;
Scanner sc = new Scanner(System.in);

if(a>b || a>c)

{
if(a>b)
{
System.out.println(" maximum number is a =" +a);
}
else
{
System.out.println(" maximum number is b =" +b);	
}


}
else
{
	System.out.println(" maximum number is c =" +c);

}



}
}