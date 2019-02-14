package problem03;

public class RectTriangle extends Shape {
	private double width;
	private double height;

	public RectTriangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		System.out.println("");
		return (this.width*this.height)/2;
	}

	@Override
	public double getPerimeter() {
		return (this.width+this.height + Math.sqrt(Math.pow(this.width,2) + Math.pow(this.height,2)));
	}
}
