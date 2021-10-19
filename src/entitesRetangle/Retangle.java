package entitesRetangle;

public class Retangle {
	public Double width;
	public Double height;
	
	public Double area() {
		return height * width;
	}
	
	public Double perimeter() {
		return (height * 2) + (width * 2);
	}
	
	public Double diagonal() {
		double a = Math.pow(width, 2) + Math.pow(height, 2);
		return Math.sqrt(a);
	}
	
	
}

