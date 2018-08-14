public class Cone extends Circle{  //Declaring class Cone.Retrieves info and variables from the circle superclass
	
	protected double copper = 8.9;
	
	protected double height;
	
	public Cone(){ //constructor
	}
	
	public void setHeight(double h){ //Set a new height
		height=h;
	}

	public double findVolume(){ //Returns volume
		return  (((findArea() * height) / 3)/1000); //Formula for Volume. Divide by 1000 to  get dm3 instead of cm3 
	}
	public double findSurfaceArea(){ //Returns surface area
		return ((Math.PI * radius*(Math.sqrt((radius*radius)+(height*height)))) + (findArea())); //Formula for surface area
	}
	public double findWeight(){ //Returns weight
		return  ((findVolume())-((Math.PI * ((radius-thickness)*(radius-thickness)) * (height-(thickness+thickness))/3)/1000)) * copper; 
		//Using volume minus volume with subtracted thickness to make the object hollow. Multiply by density to get mass
	}
	public String toString(){
		return ("We have created a hollow Cone\nThe material is: copper (" +  copper + "kg/dm3) \nThe thickness is: " + thickness + " cm \nThe radius is: "  + radius + " cm\nThe height is: "  + height + " cm\n" 
				+ super.toString() + "\nThe volume is: " + findVolume() + " liters" + "\nThe surface area is: " + findSurfaceArea() + " cm2" + "\nThe weight is: " + findWeight() + " kg\n");
			//Using toString and super.toString with text for return to main class
	}
}