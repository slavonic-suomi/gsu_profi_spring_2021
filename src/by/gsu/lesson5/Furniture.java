package by.gsu.lesson5;

public class Furniture implements NamedEntity, EntityWithCost {
    private String name;
    private String number;
    private int cost;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getCost() {
        return cost;
    }
}
