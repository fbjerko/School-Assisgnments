public class  Cylinder  extends Circle{  //Declaring class Cylinder .Retrieves info and variables from the circle superclass
	
	protected double tin = 7.3;
	
	protected double height;
	
	public Cylinder(){ //constructor
	}
	
	public void setHeight(double h){ //Set a new height
		height=h;
	}
	
	public double findVolume(){ //Returns volume
		return  ((findArea() * height)/1000) ; //Formula for Volume. Divide by 1000 to  get dm3 instead of cm3
	}
	public double findSurfaceArea(){ //Returns surface area
		return ((Math.PI * Math.pow(radius, 2)*2) + (2*Math.PI * radius * height)); //Formula for surface area
	}
	public double findWeight(){ //Returns weight
		return  ((findVolume())-((Math.PI * ((radius-thickness)*(radius-thickness)) * (height-(thickness+thickness)))/1000)) * tin; 
		//Using volume minus volume with subtracted thickness to make the object hollow. Multiply by density to get mass
	}
	public String toString(){
		return ("We have created a hollow Cylinder\nThe material is: tin (" +  tin + "kg/dm3) \nThe thickness is: " + thickness + " cm \nThe radius is: "  + radius + " cm\nThe height is: "  + height + " cm\n" 
				+ super.toString() + "\nThe volume is: " + findVolume() + " liters" + "\nThe surface area is: " + findSurfaceArea() + " cm2" + "\nThe weight is: " + findWeight() + " kg\n");
				//Using toString and super.toString with text for return to main class
	}
}