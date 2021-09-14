import java.util.Scanner;

class Tri{
	
public static void main(String[] args)
{
   int a,b,c;
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the One side");
   a = sc.nextInt();
   System.out.println("Enter the second side");
   b = sc.nextInt();
   c= 180-(a + b);
	System.out.println("Third side of Tringle" +c);
}








}