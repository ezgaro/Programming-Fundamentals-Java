package easterBasket;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class Basket {
    private List<Egg> data;
    private String material;
    private int capacity;

    public Basket(String material, int capacity) {
        this.data = new ArrayList<>();
        this.material = material;
        this.capacity = capacity;
    }


    public void addEgg(Egg egg) {
        if(this.data.size() >= capacity) {
            throw new RuntimeException("The basket is out of capacity!");
        }
        data.add(egg);
    }

    public boolean removeEgg(String color) {
        int initialEggCount = data.size();
        data = data.stream().filter(egg -> !Objects.equals(egg.getColor(), color)).collect(Collectors.toList());
        return data.size() != initialEggCount;
    }

    public Egg getStrongestEgg() {
        if(data.isEmpty()) {
            return null;
        }

        var strongestEgg = data.get(0);
        for (Egg egg : data) {
            if(egg.getStrength() > strongestEgg.getStrength()) {
                strongestEgg = egg;
            }
        }
        return strongestEgg;
    }

    public Egg getEgg(String color) {
        return data.stream().filter(e -> e.getColor().equals(color)).findFirst().orElse(null);

    }

    public int getCount() {
        return data.size();
    }

    public String report() {
        var sj = new StringJoiner("\n");
        sj.add(material + " basket contains: ");
        for(Egg egg : data) {
            sj.add(egg.toString());
        }
        return sj.toString();
    }
}
