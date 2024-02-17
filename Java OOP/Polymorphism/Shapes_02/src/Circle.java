public class Circle implements Shape{
	
	private Double radius;
	

	public Circle(Double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public Double calculatePerimeter() {
		return 2 * Math.PI * radius;
	}

	@Override
	public Double calculateArea() {
		return Math.PI * radius * radius;
	}
	
}
