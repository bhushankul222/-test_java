 class Mirrored{
	


	public static void main(String[] args)
	{

int i,j;
for(i=1;i<=5;i++)
{
	for(j=1;j<i;j++)
	{	
System.out.print(" ");
}


if(i==1 || i==5 )
{
	for(j=1;j<=5;j++)
	{
		System.out.print("*");
	}
}

else
{
	System.out.print("*");

for(j=1;j<=3;j++)
{
System.out.print(" ");
}

System.out.print("*");
}
System.out.println();

}

}
}