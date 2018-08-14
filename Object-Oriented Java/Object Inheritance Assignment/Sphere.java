public class Sphere extends Circle {  // Declaring class Sphere .Retrieves info and variables from the circle superclass
	
	protected double aluminium = 2.7;
	
	public Sphere(){ //constructor
	}
	
	public double findVolume(){ //Returns volume
		return  ((Math.PI  * Math.pow(radius, 3)) * (4/3)/1000) ; //Formula for Volume. Divide by 1000 to  get dm3 instead of cm3
	}
	public double findSurfaceArea(){ //Returns surfacearea
		return ((4 * Math.PI) * Math.pow(radius, 2)); //Formula for surface area
	}
	public double findWeight() { //Returns weight
			return (((findVolume()) - ((Math.PI  * Math.pow((radius-thickness), 3)) * (4/3)/1000))) * aluminium;
			//Using volume minus volume with subtracted thickness to make the object hollow. Multiply by density to get mass
		}
	public String toString(){
		return ("We have created a hollow Sphere\nThe material is: aluminium (" +  aluminium + "kg/dm3) \nThe thickness is: " + thickness + " cm \nThe radius is: "  + radius + " cm\n" + super.toString() + "\nThe volume is: " + findVolume() + " liters" + "\nThe surface area is: " 
				+ findSurfaceArea() + " cm2" + "\nThe weight is: " + findWeight() + " kg\n"); //Using toString and super.toString with text for return to main class
	}
}
