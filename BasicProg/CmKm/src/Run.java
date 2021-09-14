import java.util.Scanner;

class Run{

public static void main(String[] args)
{

float cm,m,km;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the lenght in cm");
cm=sc.nextInt();

m=cm/100;
km=cm/100000;

System.out.println("meter is" +m);
System.out.println("kilometer is"+km);



}

}