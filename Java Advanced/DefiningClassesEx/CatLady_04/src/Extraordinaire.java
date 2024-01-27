public class Extraordinaire extends Cat{
    private double decibelsOfMeows;
    public Extraordinaire(String type ,String name, double decibelsOfMeows) {
        super(name, type);
        this.decibelsOfMeows = decibelsOfMeows;
    }


    @Override
    public String toString() {
        return String.format("%s %s %.2f" , super.getName() , super.getType() , this.decibelsOfMeows);
    }
}
