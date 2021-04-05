package by.gsu.lesson2;

public class TransportMain {
    public static void main(String[] args) {
//        Transport t1 = new Transport();
//        Transport t2 = new Transport("NHXFG-34");

//        Transport t3;
//        for (int i = 0; i < 1_000_000; i++) {
//            new PublicTransport();
//        }
//        t3 = new PublicTransport();
//        Transport t4 = new PublicTransport(10, "gfbvredf-34");

        PublicTransport pt1 = new PublicTransport(
                "someVin1",
                12,
                "asd"
        );

        PublicTransport pt2 = new PublicTransport("someVin2");
        pt2.setTicketCost(12);
        pt2.setNumber("asd");

//        pt2.setVinNumber("assd");

    }
}
