package by.gsu.lesson2;

public class PublicTransport extends Transport {
    private int ticketCost;
    private final String vinNumber;

    public PublicTransport(String vinNumber) {
        this.vinNumber = vinNumber;
        System.out.println("PublicTransport constructor");
    }

    public PublicTransport(String vinNumber, int ticketCost, String number) {
        super(number);
        this.vinNumber = vinNumber;
        this.ticketCost = ticketCost;
        System.out.println("PublicTransport constructor with parameters");

    }

    public String getVinNumber() {
        return vinNumber;
    }

    public int getTicketCost() {
        return ticketCost;
    }

    public void setTicketCost(int ticketCost) {
        this.ticketCost = ticketCost;
    }
}
