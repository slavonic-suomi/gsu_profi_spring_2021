package by.gsu.lesson2;

public class PublicTransport extends Transport {
    private int ticketCost;
    private final String vinNumber;
    public static int publicTransportCounter;

    public PublicTransport(String vinNumber) {
        this.vinNumber = vinNumber;
        System.out.println("PublicTransport constructor");
        publicTransportCounter++;
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

    @Override
    public boolean equals(Object another) {
        if (this == another) {
            return true;
        }

        if (!super.equals(another)) {
            return false;
        }

        if (another instanceof PublicTransport) {
            PublicTransport pk = (PublicTransport) another;
            if (this.ticketCost == pk.ticketCost && this.vinNumber.equals(pk.vinNumber)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public String toString() {
        return "PublicTransport (vinNumber=" +
                vinNumber + ", ticketCost=" + ticketCost + ", " + super.toString() + ")";
    }
}
