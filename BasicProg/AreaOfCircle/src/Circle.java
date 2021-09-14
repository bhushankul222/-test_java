import java.util.Scanner;

class Circle{

public static void main(String[] args)
{

int r;
double d,circum,area;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the radius");
r=sc.nextInt();

d=2*r;
circum=2 * 3.14 * r;
area= 3.14*r*r;

System.out.println("Daimeter of circle is"+d);
System.out.println("Circumference of circle is"+circum);
System.out.println("Area of circle is"+area);



}

}