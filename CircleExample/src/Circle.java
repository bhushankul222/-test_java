
class Test{
	private double radius;
	private String colour;
	Test(){
		radius=1.0;
		colour="red";
	}
	Test(double r){
	this.radius=r;
	}
	Test(double radius,String colour){
		this.radius=radius;
		this.colour=colour;
	}
	public void setRadius(double radius){
        this.radius=radius;
	}
	public void setColour(String colour){
		this.colour=colour;
	}
	public double getRadius(){
		return this.radius;
	}
	public String getColour(){
		return this.colour;
	}
	 
	public void getArea(){

	System.out.println("Area of the circle: "+(2*3.14)*radius*radius);
	}
	public void displayTest(){
    System.out.println("Radius: "+this.radius);
    System.out.println("Colour: "+this.colour);
    

	}

}
class Circle{
	public static void main(String[] args){
		Test c1=new Test(2.0,"blue");
		c1.getRadius();
		c1.getColour();
		c1.displayTest();
		c1.getArea();

		Test c2=new Test(2.0,"red");
		c2.getRadius();
		c2.getColour();
		c2.displayTest();
		c2.getArea();

		Test c3=new Test(1.0,"red");
		c3.getRadius();
		c3.getColour();
		c3.displayTest();
		c3.getArea();
        


		
}
}
