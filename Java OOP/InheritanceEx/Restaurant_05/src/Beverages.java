import java.math.BigDecimal;

public class Beverages extends Product{

	private double mililiters;
	
	public Beverages(String name, BigDecimal price, double mililiters) {
		super(name, price);
		this.mililiters = mililiters;
	}

	public double getMililiters() {
		return mililiters;
	}
	
}
