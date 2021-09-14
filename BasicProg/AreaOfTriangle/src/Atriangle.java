
import java.util.Scanner;

class Atriangle{

public static void main(String[] args)
{

float base,height;
double area;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the base");
base=sc.nextInt();
System.out.println("Enter the height");
height=sc.nextInt();

area=0.5*base*height;

System.out.println("Area of triangle is "+area);


}

}