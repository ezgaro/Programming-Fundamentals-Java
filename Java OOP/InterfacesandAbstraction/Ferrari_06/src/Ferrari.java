
public class Ferrari implements Car {
	private static final String MODEL = "488-Spider";

	public Ferrari() {
	}

	@Override
	public String brakes() {
		return "Brakes!";
	}

	@Override
	public String gas() {
		return "Zadu6avam sA!";
	}

	public String getModel() {
		return MODEL;
	}

	@Override
	public String toString() {
		return String.format("%s/%s/%s/%s", MODEL, this.brakes(), this.gas(), this.getModel());
	}
}
