import java.util.Scanner;

class Arith{
	
public static void main(String[] args)
{
int num1,num2,num3;
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the first number");
   num1 = sc.nextInt();
   System.out.println("Enter the second number");
   num2 = sc.nextInt();

   num3=num1 + num2;
	System.out.println(" sum of two no. is " +num3);
   num3=num1 - num2;
   System.out.println(" sub of two no. is " +num3);
   num3=num1 * num2;
   System.out.println(" mul of two no. is " +num3);
   num3=num1 / num2;
   System.out.println(" div of two no. is " +num3);
}

}