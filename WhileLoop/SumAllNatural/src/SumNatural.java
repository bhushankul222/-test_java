import java.util.Scanner;

class SumNatural{

public static void main(String[] args)
{
int n,i=1,add=0;
Scanner sc= new Scanner(System.in);
System.out.println("Enter the no");
n=sc.nextInt();


    
while(i<=n)
{
add=add+i;
i=i+1;
}
System.out.println(add);
}
}
