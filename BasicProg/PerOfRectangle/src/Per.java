import java.util.Scanner;


class Per{


public static void main(String[] args) 
{
int l,b,per;
Scanner sc = new Scanner(System.in); 
System.out.println("Enter the length");
l=sc.nextInt();
System.out.println("Enter the Breadth");
b=sc.nextInt();

per=2*(l+b);

System.out.println("Perimeter of rectangle is "+per);

}
}