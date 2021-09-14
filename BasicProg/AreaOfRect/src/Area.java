import java.util.Scanner;

class Area{

public static void main(String[] args)
{

int l,b,area;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the length");
l=sc.nextInt();
System.out.println("Enter the Breadth");
b=sc.nextInt();

area= l*b;

System.out.println("Area of rectangle is"+area);


}

}