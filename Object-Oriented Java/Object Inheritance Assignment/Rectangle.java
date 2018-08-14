public abstract class Rectangle extends GeometricObject{  //Declaring class Rectangle.Retrieves info and variables from the GeometricObject superclass
	
	protected double height;
	
	public Rectangle (){	 //constructor
	}
		
	public void setHeight(double h){ //Set a new height
		height=h;
	}
	protected double width; 
		
	public void setWidth(double w){ //Set a new width
		width=w;
	}
	

	public double findArea(){ //Formula for the area
		return (width * height);
	}
	public String toString(){
		return ("The area is " + findArea() + " cm2"); //Using toString method to return info to subclass
	}

}
	