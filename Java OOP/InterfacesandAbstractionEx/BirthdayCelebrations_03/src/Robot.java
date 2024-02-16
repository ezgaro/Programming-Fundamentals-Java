public class Robot implements Identifiable{
	private String id;
	private String model;
	
	public Robot(String id, String model) {
		super();
		this.id = id;
		this.model = model;
	}
	
	public String getModel() {
		return this.model;
	}

	@Override
	public String getInt() {
		return this.id;
	}
}
