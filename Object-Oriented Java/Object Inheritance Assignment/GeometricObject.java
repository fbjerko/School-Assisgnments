public abstract class GeometricObject { //Declaring superclass GeometricObject

	public double thickness;
	public void setThickness(double t){
		thickness=t;
	}

	public abstract double findArea();
	public abstract double findVolume();
	public abstract double findCircumference();
	public abstract double findSurfaceArea();
	public abstract double findWeight();
	
	
	
	}
