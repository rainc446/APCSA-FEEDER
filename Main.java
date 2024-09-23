public class Main {

    public static void main(String[] args)
    {
        /*
        Feeder f = new Feeder();
        System.out.println(f);
        System.out.println(f.getCurrentFood());

        Feeder g = new Feeder(500);
        g.simulateOneDay(12);
        System.out.println(g.getCurrentFood());
        */
        Feeder h = new Feeder(1000);
        h.simulateOneDay(22);
        System.out.println(h.getCurrentFood());
        //
        Feeder f = new Feeder(2400);
        f.simulateOneDay(10);
        System.out.println(f.getCurrentFood());


    }
}