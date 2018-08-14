public abstract class Circle extends GeometricObject { //Declaring class Circle. Retrieves info and variables from the GeometricObject superclass

	protected double radius;
	
	public Circle (){ //constructor
	}
	
	public void setRadius(double r){ //Set a new radius
		radius=r;
	}

    public double findArea() { //Returns area
    	return radius * radius * Math.PI; //Formula for the area
    }
    public double findCircumference(){ //Returns circumference
    	return 2 * radius * Math.PI; //Formula for circumference
    }
    public String toString(){
		return ("The area is: " + findArea() + " cm2" + "\nThe circumference is: " + findCircumference() + " cm"); //Using toString method to return info to subclass
    }
}