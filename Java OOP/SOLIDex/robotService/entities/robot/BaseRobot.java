package robotService.entities.robot;

public abstract class BaseRobot implements Robot{
    private String name;
    private String kind;
    private int kilograms;
    private double price;

    public BaseRobot(String name, String kind, int kilograms, double price) {
        this.setName(name);
        this.setKind(kind);
        this.setKilograms(kilograms);
        this.setPrice(price);
    }

    @Override
    public void eating() {
        this.kilograms++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.isBlank()) {
            throw new NullPointerException("Robot name cannot be null or empty.");
        }
        this.name = name;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        if(kind == null || kind.isBlank()) {
            throw new NullPointerException("Robot kind cannot be null or empty.");
        }
        this.kind = kind;
    }

    public int getKilograms() {
        return kilograms;
    }

    public void setKilograms(int kilograms) {
        this.kilograms = kilograms;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price <= 0 ) {
            throw new IllegalArgumentException("Robot price cannot be below or equal to 0.");
        }
        this.price = price;
    }
}
