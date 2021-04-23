package by.gsu.lesson5;

public class Kitchen {
    int totalPrice;
    Customer customer;
    Furniture[] elements;
    Job[] jobs;

    Color color;

    public static void main(String[] args) {
        Kitchen kitchen = new Kitchen();
        kitchen.customer = new Customer();
        kitchen.totalPrice = 12354;

        kitchen.color = Color.BLUE;
    }

}
