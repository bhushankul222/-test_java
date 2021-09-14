class Employee{
	

    private String name;
	private int year;
	private int salary;
	private String Address;

	Employee(String name, int year, int salary, String address){
		this.name=name;
		this.year=year;
		this.salary=salary;
		this.address=address;
	}

	public String getName(){
		return this.name;
	} 
	public int getYear(){
		return this.year;
	}
	public int getSalary(){
		return this.salary;
	}  
	public String getAddress(){
		return this.address;
	}  


	public void setYear(String Year){
		this.year=year;
	}

	public void displayMethod(){
		System.out.println("Name   : "+this.name);
		System.out.println("Year  : "+this.year);
		System.out.println("Salary : "+this.salary);
		System.out.println("Address : "+this.address);

	}

}
class Genral{
	public static void main(String[] args) {
		Employee a1 = new Employee("Bhushan Kalsarpe", 1995 , 5000 , "Bhandara");
		a1.getName();
		a1.getYear();
		a1.getSalary();
		a1.getAddress();
		a1.displayMethod();
		
	}
}	


