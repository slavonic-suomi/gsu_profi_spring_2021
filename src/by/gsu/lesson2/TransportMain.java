package by.gsu.lesson2;

public class TransportMain {
    public static void main(String[] args) {
        System.out.println(Transport.getTransportCounter());

        Transport t1 = new Transport("NHXFG-34");
        String number1 = new String("NHXFG-34");
        Transport t2 = new Transport(number1);

//        System.out.println(t1.equals("asdasd"));
//        System.out.println(t1.equals(t2));
//        System.out.println(t1.equals(t1));
//        t2 = null;
//        t1.equals(t2);

//        Transport t3;
//        for (int i = 0; i < 1_000_000; i++) {
//            new PublicTransport();
//        }
//        t3 = new PublicTransport();
//        Transport t4 = new PublicTransport(10, "gfbvredf-34");

        PublicTransport pt1 = new PublicTransport(
                "someVin1",
                12,
                "asd2"
        );

        PublicTransport pt2 = new PublicTransport("someVin1");
        pt2.setTicketCost(12);
        pt2.setNumber("asd");

        System.out.println(pt1.equals(pt2));

        System.out.println(t1);
        System.out.println(pt1);

        System.out.println(Transport.getTransportCounter());

    }
}
