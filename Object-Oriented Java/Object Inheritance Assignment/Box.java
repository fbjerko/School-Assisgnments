public class Box extends Rectangle{  //Declaring class Box .Retrieves info and variables from the Rectangle superclass
	
	protected double iron = 7.8;
	
	protected double depth;
	
	public Box (){	//constructor
	}		
	
	public void setDepth(double d){ //Set a new depth
		depth=d;
	}
		
	
	public double findVolume(){ //Returns volume
		return ((findArea() * depth)/1000); //Formula for Volume. Divide by 1000 to  get dm3 instead of cm3
	}
	public double findCircumference(){ //Returns circumference
		return (width + width + depth + depth); //Formula for circumference
	}
	public double findSurfaceArea(){ //Returns surface area
		return (((findArea())*4)+((width*depth)*2)); //Formula for surface area
	}
	public double findWeight() { //Returns weight
		return (findVolume() -(((depth-thickness) * (width-thickness) * (height-thickness))/1000))*iron; 
		//Using volume minus volume with subtracted thickness to make the object hollow. Multiply by density to get mass
	}
	public String toString(){
		return ("We have created a hollow box\nThe material is: iron (" +  iron + "kg/dm3) \nThe thickness is: " + thickness + " cm \nThe height is: "  + height + " cm\nThe width is: "  + width + 
				" cm\nThe depth is: "  + depth + " cm\n" + super.toString() + "\nThe circumference is: " + findCircumference() + " cm\nThe volume is: " + findVolume() + " liters" + "\nThe surface area is: " + findSurfaceArea() + " cm2" + "\nThe weight is: " + findWeight() + " kg\n");
		//Using toString and super.toString with text for return to main class
	}		
}