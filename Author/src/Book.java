class Author{
	private String name;
	private String email;
	private char gender;

	Author(String name, String email, char gender){
		this.name=name;
		this.email=email;
		this.gender=gender;
	}

	public String getName(){
		return this.name;
	} 
	public String getEmail(){
		return this.email;
	}
	public char getGender(){
		return this.gender;
	}  

	public void setEmail(String email){
		this.email=email;
	}

	public void displayMethod(){
		System.out.println("Name   : "+this.name);
		System.out.println("Email  : "+this.email);
		System.out.println("Gender : "+this.gender);
	}
	public void displayEmail(){
		System.out.println("Email  : "+this.email);
	}
}
class Book{
	public static void main(String[] args) {
		Author a1 = new Author("Bhushan Kalsarpe", "bhushankul@gmail.com", 'M');
		a1.getName();
		a1.getEmail();
		a1.getGender();
		a1.displayMethod();
		System.out.println("change Email Address");
		a1.setEmail("saurabh95@gmail.com");
		a1.displayEmail();
	}
}