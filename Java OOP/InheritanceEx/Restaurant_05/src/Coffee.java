import java.math.BigDecimal;

public class Coffee extends HotBaverage {
	
	private static final double COFFEE_MILILITERS = 50;
	private static final BigDecimal COFFEE_PRICE = new BigDecimal("3.50");
	private double caffeine;
	
	
	public Coffee(String name, double caffeine) {
		super(name, COFFEE_PRICE, COFFEE_MILILITERS);
		this.caffeine = caffeine;
	}
	public double getCaffeine() {
		return caffeine;
	}

	
}
