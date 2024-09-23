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
        Feeder f = new Feeder(5000);
        f.simulateManyDays(12, 5);
        System.out.println(f);


    }
}