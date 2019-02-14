package problem03;

public class Rectangle extends Shape implements Resizable {
	private double width;
	private double height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
				
		System.out.println("");
	}

	@Override
	public void resize(double rate) {
		this.width = this.width * rate;
		this.height = this.height * rate;
		
	}

	@Override
	public double getArea() {
		return this.width*this.height;
	}

	@Override
	public double getPerimeter() {
		return (this.width+this.height)*2;
	}
}