package by.gsu.lesson5;

public class Job implements CommonEntity {
    private String name;
    private String specialistName;
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
